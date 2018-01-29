package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yangyang on 2018/1/29.
 */
@Table(name = "ims_attr_value")
@Entity
public class MktResAttrValue extends MktModel {// 营销资源属性选用值:记录营销资源属性选用值。
    private Long mktResAttrValId;//营销资源属 性选用值标 识:记录营销资源属性选用值标识。
    private Long mktResAttrId; // 营销资源属 性标识: 记录营销资源属性标 识。
    private Long attrValueId; //属性值标识:记录属性值标识。
    private Long applyRegionId; // 适用区域标识:记录适用区域标识。

    public Long getMktResAttrValId() {
        return mktResAttrValId;
    }

    public void setMktResAttrValId(Long mktResAttrValId) {
        this.mktResAttrValId = mktResAttrValId;
    }

    public Long getMktResAttrId() {
        return mktResAttrId;
    }

    public void setMktResAttrId(Long mktResAttrId) {
        this.mktResAttrId = mktResAttrId;
    }

    public Long getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }
}
