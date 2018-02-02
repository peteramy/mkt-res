package cn.com.tontron.res.com.card.dto;

import cn.com.tontron.res.com.card.entity.MktResCardInst;
import cn.com.tontron.res.com.card.entity.MktResCardInstAttr;
import cn.com.tontron.res.com.card.entity.MktResCardUseRec;

import java.util.List;

/**
 * Created by yangyang on 2018/1/30.
 * 3.2.8. UIM卡资源详细信息
 * UIM 卡详细信息，包含营销资源卡实例对象及与其有直接关系的子表对象。
 */
public class MktResCardInstDetail extends MktResCardInst {
    private List<MktResCardInstAttr> mktResCardInstAttrs;//营销资源卡 实例属性
    private List<MktResCardUseRec> mktResCardUseRecs; // 营销资源卡 使用记录

    public List<MktResCardInstAttr> getMktResCardInstAttrs() {
        return mktResCardInstAttrs;
    }

    public void setMktResCardInstAttrs(List<MktResCardInstAttr> mktResCardInstAttrs) {
        this.mktResCardInstAttrs = mktResCardInstAttrs;
    }

    public List<MktResCardUseRec> getMktResCardUseRecs() {
        return mktResCardUseRecs;
    }

    public void setMktResCardUseRecs(List<MktResCardUseRec> mktResCardUseRecs) {
        this.mktResCardUseRecs = mktResCardUseRecs;
    }
}
