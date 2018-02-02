package cn.com.tontron.res.bus.ims.provider;

import cn.com.tontron.res.bus.ims.service.ImsStoreService;
import cn.com.tontron.res.com.ims.dto.bus.QryMktResStoreListRsp;
import cn.com.tontron.res.com.ims.entity.MktResStore;
import cn.com.tontron.res.common.base.entity.ResMs;
import cn.com.tontron.res.common.message.req.MsReqReceiveMsg;
import cn.com.tontron.res.common.message.rsp.MsRspSendMsg;
import cn.com.tontron.res.common.ms.MsApi;
import cn.com.tontron.res.common.ms.MsProvider;
import cn.com.tontron.res.common.service.MsCallService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangyang on 2018/1/23.
 */
@MsProvider(ms = ResMs.ims, type = MsProvider.Type.Business)
@Component
public class ResImsBusProvider {
    @Autowired
    private MsCallService msCallService;
    @Autowired
    private ImsStoreService imsStoreService;

    @MsApi(apiCode = "40400100010001")
    public MsRspSendMsg createMkResStore(MsReqReceiveMsg reqMsg) throws JsonProcessingException {
        MktResStore store = imsStoreService.createMkResStore(reqMsg);
        MsRspSendMsg rspMsg = msCallService.rspAssemble(store, reqMsg);
        return rspMsg;
    }

    @MsApi(apiCode = "40400100020001")
    public MsRspSendMsg modMkResStore(MsReqReceiveMsg reqMsg) throws JsonProcessingException {
        MsRspSendMsg rspMsg = msCallService.rspAssemble(null, reqMsg);
        try {
            imsStoreService.modMkResStore(reqMsg);
        } catch (RuntimeException e) {
            rspMsg.getSvcCont().setResultCode("-1");
            rspMsg.getSvcCont().setResultMsg(e.getMessage());
        }
        return rspMsg;
    }

    @MsApi(apiCode = "40400100030001")
    public MsRspSendMsg qryMkResStoreList(MsReqReceiveMsg reqMsg) throws JsonProcessingException {
        QryMktResStoreListRsp listRsp = imsStoreService.qryMkResStoreList(reqMsg);
        MsRspSendMsg rspMsg = msCallService.rspAssemble(listRsp, reqMsg);
        return rspMsg;
    }
}
