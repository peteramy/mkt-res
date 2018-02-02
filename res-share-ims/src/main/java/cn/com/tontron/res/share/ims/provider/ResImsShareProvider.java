package cn.com.tontron.res.share.ims.provider;

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
@MsProvider(ms = ResMs.ims, type = MsProvider.Type.Share)
@Component
public class ResImsShareProvider {
    @Autowired
    private MsCallService msCallService;

    @MsApi(apiCode = "99999900200001")
    public MsRspSendMsg findUserByName(MsReqReceiveMsg reqMsg) {
        return null;
    }
}
