package cn.com.tontron.res.common.service;

import cn.com.tontron.res.common.base.entity.ResMs;
import cn.com.tontron.res.common.component.EasyJsonComponent;
import cn.com.tontron.res.common.message.req.*;
import cn.com.tontron.res.common.message.rsp.MsRspReceiveMsg;
import cn.com.tontron.res.common.message.rsp.MsRspSendMsg;
import cn.com.tontron.res.common.ms.MsApi;
import cn.com.tontron.res.common.ms.MsProvider;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

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

    /*
     * send
     */
    public MsRspReceiveMsg send(ResMs ms, String api) {
        return send(ms, api, new HashMap<String, Object>());
    }

    public MsRspReceiveMsg send(ResMs ms, String api, String... args) {
        if (args == null || args.length == 0 || StringUtils.isEmpty(args[0])) {
            return send(ms, api);
        }
        Assert.isTrue(args.length % 2 == 0, "Args should be dual.");
        Map<String, Object> arg = new HashMap<String, Object>();
        for (int i = 0; i < args.length; i += 2) {
            arg.put(args[i], args[i + 1]);
        }
        return send(ms, api, arg);
    }

    public MsRspReceiveMsg send(String api, Object args) {
        return send(null, api, args);
    }

    public MsRspReceiveMsg send(ResMs ms, String api, Object args) {
        TcpCont tcpCont = new TcpCont();
        tcpCont.setApiCode(api);
        tcpCont.setSvcCode(api.substring(0, 10));
        // TODO:
        if (ms != null && contextType()) {
            SvcContReceive contReceive = new SvcContReceive();
            JsonNode jsonNode = easyJsonComponent.readTree(easyJsonComponent.toJson(args));
            contReceive.setRequestObject(jsonNode);
            MsReqReceiveMsg msg = new MsReqReceiveMsg(tcpCont, contReceive);
            MsRspSendMsg rspMsg = process(ms, msg, true);
            String repStr = easyJsonComponent.toJson(rspMsg);
            return rspAssemble(repStr);
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
                ImmutablePair<String, String> routingInfo = mqRoutingInfo(ms, api);
                Message respMsg = template.sendAndReceive(routingInfo.getLeft(), routingInfo.getRight(), message);
                if (respMsg != null && respMsg.getBody() != null && respMsg.getBody().length > 0) {
                    try {
                        String rspBody = new String(respMsg.getBody(), "utf-8");
                        return rspAssemble(rspBody);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }

    public MsRspSendMsg rspAssemble(Object o, MsReqReceiveMsg req) {
        MsRspSendMsg msRspSendMsg = new MsRspSendMsg(o, req);
        msRspSendMsg.getTcpCont().setReqTime(sdf.format(new Date()));
        return msRspSendMsg;
    }

    private MsRspReceiveMsg rspAssemble(String str) {
        JsonNode node = easyJsonComponent.readTree(str);
        return new MsRspReceiveMsg(node);
    }

    /*
     * receive
     */
    public Message receive(ResMs ms, Message message) {
        try {
            String msgStr = new String(message.getBody(), "utf8");
            JsonNode msgNode = easyJsonComponent.readTree(msgStr);
            MsReqReceiveMsg receiveMsg = new MsReqReceiveMsg(msgNode);
            MsRspSendMsg rspSendMsg = process(ms, receiveMsg);
            MessageProperties messageProperties = message.getMessageProperties();
            byte[] msgBody = new byte[0];
            try {
                msgBody = easyJsonComponent.toJson(rspSendMsg).getBytes("utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            Message msg = new Message(msgBody, messageProperties);
            return msg;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private MsRspSendMsg process(ResMs ms, MsReqReceiveMsg msg) {
        return process(ms, msg, msg.getTcpCont().getApiCode().startsWith("999999"));
    }

    private MsRspSendMsg process(ResMs ms, MsReqReceiveMsg msg, boolean inside) {
        Map<String, Object> providerMap = applicationContext.getBeansWithAnnotation(MsProvider.class);
        for (Object provider : providerMap.values()) {
            MsProvider msProvider = provider.getClass().getAnnotation(MsProvider.class);
            if (msProvider.ms().equals(ms)) {
                Method[] methods = provider.getClass().getDeclaredMethods();
                for (Method method : methods) {
                    MsApi msApi = method.getAnnotation(MsApi.class);
                    // 内部可以调用外部，外部不能调用内部
                    if (msApi != null && msApi.apiCode().equals(msg.getTcpCont().getApiCode())
                            && (inside || MsApi.Type.Outside.equals(msApi.type()))) {
                        MsRspSendMsg rspMsg = null;
                        try {
                            rspMsg = (MsRspSendMsg) method.invoke(provider, msg);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                        return rspMsg;
                    }
                }
            }
        }
        return MsRspSendMsg.MethodNotFount(msg);
    }

    private boolean contextType() {
        return "context".equals(environment.getProperty("spring.ms.modal"));
    }

    private ImmutablePair<String, String> mqRoutingInfo(ResMs ms, String apiKey) {
        // TODO
        return new ImmutablePair<>("", "");
    }
}
