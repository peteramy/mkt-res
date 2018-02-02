package cn.com.tontron.res.bus.ims.service;

import cn.com.tontron.res.com.ims.dto.MktResStoreDetail;
import cn.com.tontron.res.com.ims.dto.bus.QryMktResStoreListReq;
import cn.com.tontron.res.com.ims.dto.bus.QryMktResStoreListRsp;
import cn.com.tontron.res.com.ims.entity.MktResStore;
import cn.com.tontron.res.common.component.EasyJsonComponent;
import cn.com.tontron.res.common.message.req.MsReqReceiveMsg;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yangyang on 2018/1/30.
 */
@Service
@Transactional
public class ImsStoreService {
    @Autowired
    private EasyJsonComponent easyJsonComponent;

    public MktResStore createMkResStore(MsReqReceiveMsg reqMsg) throws JsonProcessingException {
        MktResStoreDetail storeDetail = easyJsonComponent.treeToValue(reqMsg.getSvcCont().getRequestObject(), MktResStoreDetail.class);
        return null;
    }

    public void modMkResStore(MsReqReceiveMsg reqMsg) throws JsonProcessingException {
        MktResStoreDetail storeDetail = easyJsonComponent.treeToValue(reqMsg.getSvcCont().getRequestObject(), MktResStoreDetail.class);
    }

    public QryMktResStoreListRsp qryMkResStoreList(MsReqReceiveMsg reqMsg) throws JsonProcessingException {
        QryMktResStoreListReq listReq = easyJsonComponent.treeToValue(reqMsg.getSvcCont().getRequestObject(), QryMktResStoreListReq.class);
        return null;
    }
}
