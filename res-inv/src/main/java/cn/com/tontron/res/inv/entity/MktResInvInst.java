package cn.com.tontron.res.inv.entity;

import cn.com.tontron.res.common.base.entity.MktResModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yangyang on 2018/1/29.
 * 3.1.1. 营销资源发票实例
 * 记录营销资源发票实例。专票的实例数量小，每张都生成一条实例记录; 非专票资源的，按每本生成一条实例记录，同时记录开始和结束票号
 */
@Table(name = "inv_inst")
@Entity
public class MktResInvInst extends MktResModel { // 3.1.1. 营销资源发票实例
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResInvInstId; // 营销资源发票 实例标识：营销资源实例的标 识，主键
    @Length(max = 20)
    @Column(length = 20)
    private String invoiceCode; // 发票代码：记录营销资源实例的 发票代码，计费建议。
    private Long invStaNum; // 起始票号：记录一本非专票的发 票实例的最初的票 号。
    private Long invEndNum; // 结束票号：记录一本非专票的发 票实例的最后一张的 票号，如一本是 100 张，则结束票号等与 开始票号+100。
    private Long invCurNum; // 当前票号：记录一本非专票的发票实例的当前还未使用的最小票号(第一张)，最开始未使用时当前票号等于起始票号，每次使用后入库时把当前票号更新 还未使用的最小票 号。
    private Long useStaffId; // 领用工号标识：记录当前使用发票的 员工标识，以便计费 打印发票使用。2015-3-20
    private Long useOrgId; // 领用组织标识:记录当前使用发票的 员工的当前组织标 识，以便计费打印发 票使用。2015-3-20
    private Long quantity;// 数量:记录营销资源实例的 数量
    @Length(max = 3)
    @Column(length = 2)
    private String unit; // 单位:记录发票单 位,LOVB=RES-C-0022
    private Long restQuantity; // 剩余数量:记录营销资源实例的剩余数量，针对无序资源。
    private Long rootInstId; // 根实例标识:根资源实例的标识，资源拆分时，记录最初的资源实例标识，便于 述新实例的来源
    private Long platId; // 平台标识:记录来源平台标识，如 MSS 或集团终端系统
    private Long lanId; // 本地网标识:记录本地网标识。
    private Long regionId; // 区域标识:记录区域标识。指向公共管理区域标识
    private Long partnerId; // 合作伙伴标识：资源供应商 ID

    public Long getMktResInvInstId() {
        return mktResInvInstId;
    }

    public void setMktResInvInstId(Long mktResInvInstId) {
        this.mktResInvInstId = mktResInvInstId;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public Long getInvStaNum() {
        return invStaNum;
    }

    public void setInvStaNum(Long invStaNum) {
        this.invStaNum = invStaNum;
    }

    public Long getInvEndNum() {
        return invEndNum;
    }

    public void setInvEndNum(Long invEndNum) {
        this.invEndNum = invEndNum;
    }

    public Long getInvCurNum() {
        return invCurNum;
    }

    public void setInvCurNum(Long invCurNum) {
        this.invCurNum = invCurNum;
    }

    public Long getUseStaffId() {
        return useStaffId;
    }

    public void setUseStaffId(Long useStaffId) {
        this.useStaffId = useStaffId;
    }

    public Long getUseOrgId() {
        return useOrgId;
    }

    public void setUseOrgId(Long useOrgId) {
        this.useOrgId = useOrgId;
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

    public Long getRootInstId() {
        return rootInstId;
    }

    public void setRootInstId(Long rootInstId) {
        this.rootInstId = rootInstId;
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
}
