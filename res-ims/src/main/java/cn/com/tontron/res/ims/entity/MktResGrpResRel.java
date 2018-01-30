package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/30.
 * 3.1.40. 营销资源组与营销资源关系
 * 描述营销资源组与营销资源之间的关系
 */
@Table(name = "ims_grp_res_rel")
@Entity
public class MktResGrpResRel extends MktModel{ //3.1.40. 营销资源组与营销资源关系
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long grpResRelId; //营销资源组与营销资源关系标识:营销资源组成员主键
    private Long mktResGrpId; //营销资源组标识:营销资源组标识
    private Long mktResId; //营销资源标识:记录营销资源标识。
    private Long applyRegionId; //适用区域标识:记录适用的区域范围，来源COMMON_REGION_ID。

    public Long getGrpResRelId() {
        return grpResRelId;
    }

    public void setGrpResRelId(Long grpResRelId) {
        this.grpResRelId = grpResRelId;
    }

    public Long getMktResGrpId() {
        return mktResGrpId;
    }

    public void setMktResGrpId(Long mktResGrpId) {
        this.mktResGrpId = mktResGrpId;
    }

    public Long getMktResId() {
        return mktResId;
    }

    public void setMktResId(Long mktResId) {
        this.mktResId = mktResId;
    }

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }
}
