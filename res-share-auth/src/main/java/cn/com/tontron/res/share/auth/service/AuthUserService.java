package cn.com.tontron.res.share.auth.service;

import cn.com.tontron.res.common.base.entity.ResMs;
import cn.com.tontron.res.common.message.rsp.MsRspReceiveMsg;
import cn.com.tontron.res.common.service.MsCallService;
import cn.com.tontron.res.share.auth.entity.AuthUser;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yangyang on 2018/1/15.
 */
@Service
@Transactional
public class AuthUserService {
    @Autowired
    private MsCallService msCallService;

    public AuthUser findByName(String username) {
        MsRspReceiveMsg rspMsg = msCallService.send(ResMs.auth, null, "99999900010001", "username", username);
        if (rspMsg.getSvcCont().getResultObject() != null && rspMsg.getSvcCont().getResultObject().size() > 0) {
            JsonNode node = rspMsg.getSvcCont().getResultObject().get(0);
            AuthUser authUser = new AuthUser();
            authUser.setUsername(node.get("username").asText());
            authUser.setPassword(node.get("password").asText());
            return authUser;
        }
        return null;
    }
}
