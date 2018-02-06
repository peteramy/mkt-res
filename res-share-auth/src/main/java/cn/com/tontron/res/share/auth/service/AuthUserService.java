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
        JsonNode reqNode = rspMsg.getSvcCont().getResultObject();
        if (reqNode != null && reqNode.size() > 0) {
            JsonNode rows = reqNode.get("rows");
            if (rows != null && rows.size() > 0) {
                AuthUser authUser = new AuthUser();
                authUser.setUsername(rows.get(0).get("username").asText());
                authUser.setPassword(rows.get(0).get("password").asText());
                return authUser;
            }
        }
        return null;
    }
}
