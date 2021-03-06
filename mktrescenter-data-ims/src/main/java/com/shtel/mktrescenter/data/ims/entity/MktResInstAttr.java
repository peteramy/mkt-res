package com.shtel.mktrescenter.data.ims.entity;

import org.hibernate.validator.constraints.Length;

/**
 * Created by yangyang on 2018/1/29.
 * 3.1.25. 营销资源实例属性
 * 记录营销资源实例属性信息。
 */
public class MktResInstAttr extends MktModel { // 3.1.25. 营销资源实例属性
    private Long mktResInstAttrId; // 营销资源实例 属性标识: 记录营销资源实例属 性 ID。
    private Long mktResInstId; // 营销资源实例 标识
    private Long attrId; // 属性标识
    private Long attrValueId; // 属性值标识
    @Length(max = 30)
    private String attrValue; // 属性值
    private Long lanId; // 本地网标识
    private Long regionId; // 区域标识

    public Long getMktResInstAttrId() {
        return mktResInstAttrId;
    }

    public void setMktResInstAttrId(Long mktResInstAttrId) {
        this.mktResInstAttrId = mktResInstAttrId;
    }

    public Long getMktResInstId() {
        return mktResInstId;
    }

    public void setMktResInstId(Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public Long getLanId() {
        return lanId;
    }

    public void setLanId(Long lanId) {
        this.lanId = lanId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }
}
