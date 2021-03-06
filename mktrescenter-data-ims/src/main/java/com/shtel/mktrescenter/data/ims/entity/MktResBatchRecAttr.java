package com.shtel.mktrescenter.data.ims.entity;

import org.hibernate.validator.constraints.Length;

/**
 * Created by yyn on 2018/1/30.
 * 3.1.41. 营销资源管理批次属性
 * 记录营销资源管理批次属性信息。
 */
public class MktResBatchRecAttr extends MktModel{ //3.1.41. 营销资源管理批次属性
    private Long mktResInstAttrId; //营销资源管理批次属性标识:记录营销资源实例属性ID
    private Long mktResBatchId; //资源管理批次标识:来源于物资管理系统时产生的数据
    private Long attrId; //属性标识:记录属性 ID。
    private Long attrValueId; //属性值标识:属性值标识
    @Length(max = 30)
    private String attrValue; //属性值:属性值
    private Long lanId; // 本地网标识: 记录本地网标识
    private Long regionId; // 区域标识: 指向公共管理区域标识

    public Long getMktResInstAttrId() {
        return mktResInstAttrId;
    }

    public void setMktResInstAttrId(Long mktResInstAttrId) {
        this.mktResInstAttrId = mktResInstAttrId;
    }

    public Long getMktResBatchId() {
        return mktResBatchId;
    }

    public void setMktResBatchId(Long mktResBatchId) {
        this.mktResBatchId = mktResBatchId;
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
