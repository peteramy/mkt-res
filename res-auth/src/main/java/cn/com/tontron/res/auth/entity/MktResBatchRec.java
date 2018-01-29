package cn.com.tontron.res.auth.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/29.
 */
@Table(name = "batch_rec")
@Entity
public class MktResBatchRec extends MktModel { //营销资源管理批次
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResBatchId; //资源管理批次标识:来源于物资管理系统时产生的数据
    @Length(max = 30)
    private Long mktResBatchNbr; //资源管理批次编码:资源管理批次编码，如外系统同步的批次号
    private Long mktResId; //营销资源标识：营销资源标识
    private Long costPrise; //成本价格:记录营销资源批次的成本价格
    private Long quantity; //数量:记录批次记录的数量
    private Long lanId; //本地网标识：本地网标识。
    private Long regionId; //区域标识：指向公共管理区域标识

    public Long getMktResBatchId() {
        return mktResBatchId;
    }

    public void setMktResBatchId(Long mktResBatchId) {
        this.mktResBatchId = mktResBatchId;
    }

    public Long getMktResBatchNbr() {
        return mktResBatchNbr;
    }

    public void setMktResBatchNbr(Long mktResBatchNbr) {
        this.mktResBatchNbr = mktResBatchNbr;
    }

    public Long getMktResId() {
        return mktResId;
    }

    public void setMktResId(Long mktResId) {
        this.mktResId = mktResId;
    }

    public Long getCostPrise() {
        return costPrise;
    }

    public void setCostPrise(Long costPrise) {
        this.costPrise = costPrise;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
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