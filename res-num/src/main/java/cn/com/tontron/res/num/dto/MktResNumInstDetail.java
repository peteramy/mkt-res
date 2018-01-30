package cn.com.tontron.res.num.dto;

import cn.com.tontron.res.num.entity.*;

import java.util.List;

/**
 * Created by yyn on 2018/1/30.
 * 3.2.7. 营销资源号码实例详细信息
 * 包含营销资源号码实例对象及与其有直接关系的子表对象。
 */
public class MktResNumInstDetail extends MktResNumInst {
    private List<MktResCardNumAttr> mktResCardNumAttrs; //营销资源号码实例属性:营销资源号码实例属性
    private List<MktResNumUseRec> mktResNumUseRecs; //营销资源号码使用记录
    private List<MktResNumEvtDetail> mktResNumEvtDetails; //营销资源库存号码变动事件明细:营销资源库存号码变 动事件明细
    private List<MktResNumPreUse> mktResNumPreUses; //预选:预选

    public List<MktResCardNumAttr> getMktResCardNumAttrs() {
        return mktResCardNumAttrs;
    }

    public void setMktResCardNumAttrs(List<MktResCardNumAttr> mktResCardNumAttrs) {
        this.mktResCardNumAttrs = mktResCardNumAttrs;
    }

    public List<MktResNumUseRec> getMktResNumUseRecs() {
        return mktResNumUseRecs;
    }

    public void setMktResNumUseRecs(List<MktResNumUseRec> mktResNumUseRecs) {
        this.mktResNumUseRecs = mktResNumUseRecs;
    }

    public List<MktResNumEvtDetail> getMktResNumEvtDetails() {
        return mktResNumEvtDetails;
    }

    public void setMktResNumEvtDetails(List<MktResNumEvtDetail> mktResNumEvtDetails) {
        this.mktResNumEvtDetails = mktResNumEvtDetails;
    }

    public List<MktResNumPreUse> getMktResNumPreUses() {
        return mktResNumPreUses;
    }

    public void setMktResNumPreUses(List<MktResNumPreUse> mktResNumPreUses) {
        this.mktResNumPreUses = mktResNumPreUses;
    }
}
