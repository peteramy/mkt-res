package cn.com.tontron.res.ui.service.auth;

import cn.com.tontron.res.common.base.entity.ResMs;
import cn.com.tontron.res.common.component.EasyJsonComponent;
import cn.com.tontron.res.common.message.rsp.MsRspReceiveMsg;
import cn.com.tontron.res.common.service.MsCallService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yangyang on 2018/1/15.
 */
@Service
@Transactional
public class AuthTestService {
    @Autowired
    private EasyJsonComponent easyJsonComponent;
    @Autowired
    private MsCallService msCallService;

    public JsonNode findByUsername(String s) {
        MsRspReceiveMsg o = msCallService.send(ResMs.ui, ResMs.auth, "99999900100001", "username", s);
        return o.getSvcCont().getResultObject();
    }
}
