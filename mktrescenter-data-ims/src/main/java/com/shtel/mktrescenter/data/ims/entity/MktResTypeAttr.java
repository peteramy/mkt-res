package com.shtel.mktrescenter.data.ims.entity;

import org.hibernate.validator.constraints.Length;

/**
 * Created by yangyang on 2018/1/30.
 * 3.1.45. 营销资源类别属性
 * 记录营销营销资源类别属性
 */
public class MktResTypeAttr extends MktModel {
    private Long mktResTypeAttrId; // 营销资源类 别属性标识
    private Long mktResTypeId; // 营销资源类别标识: 营销资源 CD 的标识，主键
    private Long attrId; // 属性标识
    @Length(max = 30)
    private String defaultValue; // 默认值
    private Long applyRegionId; // 适用区域标识

    public Long getMktResTypeAttrId() {
        return mktResTypeAttrId;
    }

    public void setMktResTypeAttrId(Long mktResTypeAttrId) {
        this.mktResTypeAttrId = mktResTypeAttrId;
    }

    public Long getMktResTypeId() {
        return mktResTypeId;
    }

    public void setMktResTypeId(Long mktResTypeId) {
        this.mktResTypeId = mktResTypeId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }
}
