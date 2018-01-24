package cn.com.tontron.res.auth.provider;

import cn.com.tontron.res.auth.entity.AuthSysUser;
import cn.com.tontron.res.auth.service.AuthSysUserService;
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
@MsProvider(ms = ResMs.auth)
@Component
public class ResAuthProvider {
    @Autowired
    private AuthSysUserService userService;
    @Autowired
    private MsCallService msCallService;

    @MsApi(type = MsApi.Type.Inside, apiCode = "99999900100001")
    public MsRspSendMsg findUserByName(MsReqReceiveMsg reqMsg) {
        String username = reqMsg.getSvcCont().getRequestObject().get("username").asText();
        AuthSysUser user = userService.findByName(username);
        return msCallService.rspAssemble(user, reqMsg);
    }
}
