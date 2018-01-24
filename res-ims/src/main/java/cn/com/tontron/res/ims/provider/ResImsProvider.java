package cn.com.tontron.res.ims.provider;

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
@MsProvider(ms = ResMs.ims)
@Component
public class ResImsProvider {
    @Autowired
    private MsCallService msCallService;

    @MsApi(type = MsApi.Type.Inside, apiCode = "99999900200001")
    public MsRspSendMsg findUserByName(MsReqReceiveMsg reqMsg) {
        return null;
    }
}
