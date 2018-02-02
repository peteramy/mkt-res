package cn.com.tontron.res.com.ims.dto;

import cn.com.tontron.res.com.ims.entity.MktResChngEvtDetail;
import cn.com.tontron.res.com.ims.entity.MktResInst;
import cn.com.tontron.res.com.ims.entity.MktResInstAttr;
import cn.com.tontron.res.com.ims.entity.MktResUseRec;

import java.util.List;

/**
 * Created by yangyang on 2018/1/30.
 * 3.2.5. 营销资源实例详细信息
 * 营销资源实例详细信息，包含营销资源实例主表对象及营销资源实例属性表对 象
 */
public class MktResInstDetail extends MktResInst {
    private List<MktResInstAttr> mktResInstAttrs;// 营销资源实例 属性
    private List<MktResUseRec> mktResUseRecs; // 营销资源使用 记录
    private List<MktResChngEvtDetail> mktResChngEvtDetails; // 营销资源库存 变动事件明细

    public List<MktResInstAttr> getMktResInstAttrs() {
        return mktResInstAttrs;
    }

    public void setMktResInstAttrs(List<MktResInstAttr> mktResInstAttrs) {
        this.mktResInstAttrs = mktResInstAttrs;
    }

    public List<MktResUseRec> getMktResUseRecs() {
        return mktResUseRecs;
    }

    public void setMktResUseRecs(List<MktResUseRec> mktResUseRecs) {
        this.mktResUseRecs = mktResUseRecs;
    }

    public List<MktResChngEvtDetail> getMktResChngEvtDetails() {
        return mktResChngEvtDetails;
    }

    public void setMktResChngEvtDetails(List<MktResChngEvtDetail> mktResChngEvtDetails) {
        this.mktResChngEvtDetails = mktResChngEvtDetails;
    }
}
