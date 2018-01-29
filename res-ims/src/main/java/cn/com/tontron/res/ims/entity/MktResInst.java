package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktResModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yangyang on 2018/1/29.
 * <p>
 * 1.记录除号码、UIM 卡信息、发票以外的其他营销资源的实例信息。
 * 2.对于有序营销资源，对每个实例进行序列化管理。如手机终端等。
 * 3.对于无序营销资源，根据资源规格、批次、仓库等管理要求进行管理， 无需序列化，只需要记录库存，不生成该表记录。如礼品等。
 */
@Table(name = "ims_inst")
@Entity
public class MktResInst extends MktResModel { // 营销资源实例
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResInstId; // 营销资源发票 实例标识：营销资源实例的标 识，主键
    private Long rootInstId; // 根实例标识:根资源实例的标识，资源拆分时，记录最初的资源实例标识，便于 述新实例的来源
    private Long salesPrice; // 零售价格
    private Long platId; // 平台标识:记录来源平台标识， 如 MSS 或集团终端系 统
    private Long lanId; // 本地网标识: 记录本地网标识。
    private Long regionId; // 区域标识: 指向公共管理区域标 识
    private Long partnerId; // 合作伙伴标识: 资源供应商 ID
    @Length(max = 10)
    private String recycleType; // 回收类型:记录营销资源实例的 回收类型,LOVB=RES- C-0040

    public Long getMktResInstId() {
        return mktResInstId;
    }

    public void setMktResInstId(Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    public Long getRootInstId() {
        return rootInstId;
    }

    public void setRootInstId(Long rootInstId) {
        this.rootInstId = rootInstId;
    }

    public Long getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Long salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Long getPlatId() {
        return platId;
    }

    public void setPlatId(Long platId) {
        this.platId = platId;
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

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public String getRecycleType() {
        return recycleType;
    }

    public void setRecycleType(String recycleType) {
        this.recycleType = recycleType;
    }
}
