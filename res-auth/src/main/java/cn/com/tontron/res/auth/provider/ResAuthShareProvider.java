package cn.com.tontron.res.auth.provider;

import cn.com.tontron.res.auth.entity.AuthUser;
import cn.com.tontron.res.auth.service.AuthUserService;
import cn.com.tontron.res.common.base.entity.ResMs;
import cn.com.tontron.res.common.message.req.MsReqReceiveMsg;
import cn.com.tontron.res.common.message.rsp.MsRspSendMsg;
import cn.com.tontron.res.common.ms.MsApi;
import cn.com.tontron.res.common.ms.MsProvider;
import cn.com.tontron.res.common.service.MsCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangyang on 2018/1/23.
 */
@MsProvider(ms = ResMs.auth, type = MsProvider.Type.Share)
@Component
public class ResAuthShareProvider {
    @Autowired
    private AuthUserService userService;
    @Autowired
    private MsCallService msCallService;

    @MsApi(apiCode = "99999901010001")
    public MsRspSendMsg findUserByName(MsReqReceiveMsg reqMsg) {
        String username = reqMsg.getSvcCont().getRequestObject().get("username").asText();
        AuthUser user = userService.findByName(username);
        return msCallService.rspAssemble(user, reqMsg);
    }

    @MsApi(apiCode = "99999901010002")
    public MsRspSendMsg findUserPage(MsReqReceiveMsg reqMsg) {
        String username = reqMsg.getSvcCont().getRequestObject().get("username").asText();
        AuthUser user = userService.findByName(username);
        return msCallService.rspAssemble(user, reqMsg);
    }

    @MsApi(apiCode = "99999901010003")
    public MsRspSendMsg saveUser(MsReqReceiveMsg reqMsg) {
        String username = reqMsg.getSvcCont().getRequestObject().get("username").asText();
        AuthUser user = userService.findByName(username);
        return msCallService.rspAssemble(user, reqMsg);
    }

    @MsApi(apiCode = "99999901010004")
    public MsRspSendMsg deleteUser(MsReqReceiveMsg reqMsg) {
        String username = reqMsg.getSvcCont().getRequestObject().get("username").asText();
        AuthUser user = userService.findByName(username);
        return msCallService.rspAssemble(user, reqMsg);
    }
}
