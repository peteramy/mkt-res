package cn.com.tontron.res.common.service;

import cn.com.tontron.res.common.component.EasyJsonComponent;
import cn.com.tontron.res.common.message.req.*;
import cn.com.tontron.res.common.message.rsp.MsRspReceiveMsg;
import cn.com.tontron.res.common.message.rsp.MsRspSendMsg;
import cn.com.tontron.res.common.ms.MsApi;
import cn.com.tontron.res.common.ms.MsProvider;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.amqp.core.Message;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class MsCallService {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private Environment environment;
    @Autowired
    private EasyJsonComponent easyJsonComponent;

    public MsRspReceiveMsg call(String ms, String api) {
        return call(ms, api, new HashMap<String, Object>());
    }

    public MsRspReceiveMsg call(String ms, String api, String... args) {
        if (args == null || args.length == 0 || StringUtils.isEmpty(args[0])) {
            return call(ms, api);
        }
        Assert.isTrue(args.length % 2 == 0, "Args should be dual.");
        Map<String, Object> arg = new HashMap<String, Object>();
        for (int i = 0; i < args.length; i += 2) {
            arg.put(args[i], args[i + 1]);
        }
        return call(ms, api, arg);
    }

    public MsRspReceiveMsg call(String ms, String api, Object args) {
        return call(ms, api, args, MsProvider.Type.Inside);
    }

    public MsRspReceiveMsg call(String ms, String api, Object args, MsProvider.Type type) {
        TcpCont tcpCont = new TcpCont();
        // TODO:
        if (contextType() && MsProvider.Type.Inside.equals(type)) {
            Map<String, Object> providerMap = applicationContext.getBeansWithAnnotation(MsProvider.class);
            for (Object provider : providerMap.values()) {
                MsProvider msProvider = provider.getClass().getAnnotation(MsProvider.class);
                if (msProvider.name().equals(ms) && msProvider.type().equals(type)) {
                    Method[] methods = provider.getClass().getDeclaredMethods();
                    for (Method method : methods) {
                        MsApi msApi = method.getAnnotation(MsApi.class);
                        if (msApi != null && msApi.apiCode().equals(api)) {
                            SvcContReceive contReceive = new SvcContReceive();
                            JsonNode jsonNode = easyJsonComponent.readTree(easyJsonComponent.toJson(args));
                            contReceive.setRequestObject(jsonNode);
                            MsReqReceiveMsg msg = new MsReqReceiveMsg(tcpCont, contReceive);
                            MsRspSendMsg rspMsg = null;
                            try {
                                rspMsg = (MsRspSendMsg) method.invoke(provider, msg);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                            String repStr = easyJsonComponent.toJson(rspMsg);
                            return repAssemble(repStr);
                        }
                    }
                }
            }
        } else {// MQ
            AmqpTemplate template = applicationContext.getBean(AmqpTemplate.class);
            if (template != null) {
                SvcContSend contSend = new SvcContSend();
                contSend.setRequestObject(args);
                MsReqSendMsg msg = new MsReqSendMsg(tcpCont, contSend);
                MessageProperties messageProperties = new MessageProperties();
                byte[] msgBody = new byte[0];
                try {
                    msgBody = easyJsonComponent.toJson(msg).getBytes("utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Message message = new Message(msgBody, messageProperties);
                Message respMsg = template.sendAndReceive(message);
                if (respMsg != null && respMsg.getBody() != null && respMsg.getBody().length > 0) {
                    try {
                        String rspBody = new String(respMsg.getBody(), "utf-8");
                        return repAssemble(rspBody);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }

    public MsRspSendMsg repAssemble(Object o, MsReqReceiveMsg req) {
        MsRspSendMsg msRspSendMsg = new MsRspSendMsg(o, req);
        msRspSendMsg.getTcpCont().setReqTime(sdf.format(new Date()));
        return msRspSendMsg;
    }

    private MsRspReceiveMsg repAssemble(String str) {
        JsonNode node = easyJsonComponent.readTree(str);
        return new MsRspReceiveMsg(node);
    }

    private boolean contextType() {
        return "context".equals(environment.getProperty("spring.ms.modal"));
    }
}
