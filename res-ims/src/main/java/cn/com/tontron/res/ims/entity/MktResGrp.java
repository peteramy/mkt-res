package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/30.
 * 记录营销资源的应用分组，简化配置要求。
 */
@Table(name = "ims_grp")
@Entity
public class MktResGrp extends MktModel { //3.1.39. 营销资源组
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
