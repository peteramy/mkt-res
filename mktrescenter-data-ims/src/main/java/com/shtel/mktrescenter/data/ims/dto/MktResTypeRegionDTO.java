package com.shtel.mktrescenter.data.ims.dto;


/**
 * Created by yyn on 2018/1/30.
 * 3.1.46. 营销资源类别适用区域
 * 记录营销资源类别适用区域。
 */
public class MktResTypeRegionDTO extends MktModel { //3.1.46. 营销资源类别适用区域
    private Long mktResTypeRegionId; //营销资源类别适用区域标识:记录营销资源适用地区标识。
    private Long mktResTypeId; //营销资源类别标识:营销资源 CD 的标识
    private Long applyRegionId; //适用区域标识:适用区域标识

    public Long getMktResTypeRegionId() {
        return mktResTypeRegionId;
    }

    public void setMktResTypeRegionId(Long mktResTypeRegionId) {
        this.mktResTypeRegionId = mktResTypeRegionId;
    }

    public Long getMktResTypeId() {
        return mktResTypeId;
    }

    public void setMktResTypeId(Long mktResTypeId) {
        this.mktResTypeId = mktResTypeId;
    }

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }
}
