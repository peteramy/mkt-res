package cn.com.tontron.res.ims.dto;

import cn.com.tontron.res.ims.entity.MktResChngEvtDetail;
import cn.com.tontron.res.ims.entity.MktResEvent;

import java.util.List;

/**
 * Created by yangyang on 2018/1/30.
 * 3.2.6. 营销资源库存变动事件详情
 * 营销资源库存变动事件详细信息，包含营销资源库存变动事件主表对象及营销资 源库存变动事件明细表对象
 */
public class MktResEventDetail extends MktResEvent {
    private List<MktResChngEvtDetail> mktResChngEvtDetails; // 营销资源库 存 变 动 事 件 明细对象

    public List<MktResChngEvtDetail> getMktResChngEvtDetails() {
        return mktResChngEvtDetails;
    }

    public void setMktResChngEvtDetails(List<MktResChngEvtDetail> mktResChngEvtDetails) {
        this.mktResChngEvtDetails = mktResChngEvtDetails;
    }
}
