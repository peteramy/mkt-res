package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/29.
 * 3.1.10. 营销资源适用地区
 * 记录营销资源适用地区。
 */
@Table(name = "ims_region")
@Entity
public class MktResRegion extends MktModel { //3.1.10. 营销资源适用地区
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResRegionId; //营销资源适用地区标识:记录营销资源适用地区标识。
    private Long mktResId; //营销资源标识:营销资源标识
    private Long applyRegionId; //适用区域标识:适用区域标识
    private Long costPrice; //成本价格:记录营销资源的成本价格。
    private Long salesPrice; //零售价格:记录建议的零售价格。
    private Long clearingPrice; //结算价格:记录建议的结算价格。

    public Long getMktResRegionId() {
        return mktResRegionId;
    }

    public void setMktResRegionId(Long mktResRegionId) {
        this.mktResRegionId = mktResRegionId;
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

    public Long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Long getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Long salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Long getClearingPrice() {
        return clearingPrice;
    }

    public void setClearingPrice(Long clearingPrice) {
        this.clearingPrice = clearingPrice;
    }
}
