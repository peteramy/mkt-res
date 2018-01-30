package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/30.
 * 描述
 * 记录营销资源仓库中营销资源规格的库存数量。
 * 对于有序营销资源，还需要生成营销资源实例，对于无序营销资源，不需要生成营销资源实例，仅在营销资源库存表记录。
 */
@Table(name = "ims_inst_store")
@Entity
public class MktResInstStore extends MktModel { //3.1.43. 营销资源库存
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResInstStoreId; //营销资源库存标识:营销资源实例的标识，主键
    private Long mktResId; //营销资源标识:营销资源标识
    private Long mktResStoreId; //营销资源仓库标识:营销资源仓库标识
    private Long quantity; //数量:记录营销资源实例的数量
    @Length(max = 3)
    private String unit; //单位:记录营销资源实例的数量单位
    private Long restQuantity; //剩余数量:记录营销资源实例的剩余数量，针对无序资源。
    private Long onwayQuantity; //在途数量:记录营销资源实例的在途数量
    private Long ruinQuantity; //损坏数量:记录营销资源实例的损坏数量
    private Long partnerId; //合作伙伴标识:资源供应商 ID
    private Long regionId; // 区域标识: 指向公共管理区域标识
    private Long lanId; // 本地网标识: 记录本地网标识

    public Long getMktResInstStoreId() {
        return mktResInstStoreId;
    }

    public void setMktResInstStoreId(Long mktResInstStoreId) {
        this.mktResInstStoreId = mktResInstStoreId;
    }

    public Long getMktResId() {
        return mktResId;
    }

    public void setMktResId(Long mktResId) {
        this.mktResId = mktResId;
    }

    public Long getMktResStoreId() {
        return mktResStoreId;
    }

    public void setMktResStoreId(Long mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getRestQuantity() {
        return restQuantity;
    }

    public void setRestQuantity(Long restQuantity) {
        this.restQuantity = restQuantity;
    }

    public Long getOnwayQuantity() {
        return onwayQuantity;
    }

    public void setOnwayQuantity(Long onwayQuantity) {
        this.onwayQuantity = onwayQuantity;
    }

    public Long getRuinQuantity() {
        return ruinQuantity;
    }

    public void setRuinQuantity(Long ruinQuantity) {
        this.ruinQuantity = ruinQuantity;
    }

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getLanId() {
        return lanId;
    }

    public void setLanId(Long lanId) {
        this.lanId = lanId;
    }
}
