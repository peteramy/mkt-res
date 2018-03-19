package com.shtel.mktrescenter.data.ims.dto;


/**
 * Created by yangyang on 2018/1/30.
 * 3.1.44. 营销资源类别属性选用值
 * 记录营销营销资源类别属性选用值
 */
public class MktResTypeAttrValueDTO extends MktModel {
    private Long mktResAttrValId; // 营销资源属 性选用值标 识: 记录营销资源属性选用值 标识
    private Long mktResTypeAttrId; // 营销资源类 别属性标识: 记录营销资源类别属性标 识
    private Long attrValueId; // 属性值标识
    private Long applyRegionId; // 适用区域标 识

    public Long getMktResAttrValId() {
        return mktResAttrValId;
    }

    public void setMktResAttrValId(Long mktResAttrValId) {
        this.mktResAttrValId = mktResAttrValId;
    }

    public Long getMktResTypeAttrId() {
        return mktResTypeAttrId;
    }

    public void setMktResTypeAttrId(Long mktResTypeAttrId) {
        this.mktResTypeAttrId = mktResTypeAttrId;
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
