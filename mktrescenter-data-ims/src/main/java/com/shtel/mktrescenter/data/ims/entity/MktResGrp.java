package com.shtel.mktrescenter.data.ims.entity;

import org.hibernate.validator.constraints.Length;

/**
 * Created by yyn on 2018/1/30.
 * 3.1.39. 营销资源组
 * 记录营销资源的应用分组，简化配置要求。
 */
public class MktResGrp extends MktModel { //3.1.39. 营销资源组
    private Long mktResGrpId; //营销资源组标识:营销资源组标识，主键。
    @Length(max = 50)
    private String mktResGrpName; //营销资源组名称:营销资源组名称
    @Length(max = 250)
    private String mktResGrpDesc; //营销资源组描述:营销资源组描述
    private Long applyRegionId; //适用区域标识:记录适用的区域范围，来源COMMON_REGION_ID。

    public Long getMktResGrpId() {
        return mktResGrpId;
    }

    public void setMktResGrpId(Long mktResGrpId) {
        this.mktResGrpId = mktResGrpId;
    }

    public String getMktResGrpName() {
        return mktResGrpName;
    }

    public void setMktResGrpName(String mktResGrpName) {
        this.mktResGrpName = mktResGrpName;
    }

    public String getMktResGrpDesc() {
        return mktResGrpDesc;
    }

    public void setMktResGrpDesc(String mktResGrpDesc) {
        this.mktResGrpDesc = mktResGrpDesc;
    }

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }
}
