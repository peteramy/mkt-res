package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/30.
 * 记录营销资源类别适用区域。
 */
@Table(name = "ims_type_region")
@Entity
public class MktResTypeRegion extends MktModel { //3.1.46. 营销资源类别适用区域
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
