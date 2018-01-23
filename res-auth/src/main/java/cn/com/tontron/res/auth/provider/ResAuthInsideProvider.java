package cn.com.tontron.res.auth.provider;

import cn.com.tontron.res.auth.entity.SysUser;
import cn.com.tontron.res.auth.service.SysUserService;
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
@MsProvider(name = "auth")
@Component
public class ResAuthInsideProvider {
    @Autowired
    private SysUserService userService;
    @Autowired
    private MsCallService msCallService;

    @MsApi(type = MsApi.Type.Inside, apiCode = "99999900100001")
    public MsRspSendMsg findUserByName(MsReqReceiveMsg reqMsg) {
        String username = reqMsg.getSvcCont().getRequestObject().get("username").asText();
        SysUser user = userService.findByName(username);
        return msCallService.rspAssemble(user, reqMsg);
    }
}
