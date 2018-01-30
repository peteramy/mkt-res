package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yyn on 2018/1/29.
 * 记录电信涉及的各类营销资源规格定义信息，可以按类别、品牌、型号、 颜色等维度根据业务需要组合定义。
 */
@Table(name = "ims_resource")
@Entity
public class MktResource extends MktModel { // 3.1.7. 营销资源
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResId; //营销资源标识:营销资源标识
    @Length(max = 30)
    private String mktResNbr; //营销资源编码:记录营销资源编码。
    private Long mktResTypeId; //营销资源类别标识:营销资源类别标识
    private Long mktResExttypeId; //营销资源型号标识:营销资源型号标识
    @Length(max = 250)
    private String mktResName; //营销资源名称:记录营销资源名称。
    @Length(max = 4000)
    private String mktResDesc; //营销资源描述:营销资源描述
    private Long mktPricingPlanId; //营销资源定价计划标识:记录计费域的营销资源定价计划标识。20150421。
    @Length(max = 3)
    private String unit; //单位:记录营销资源实例的数量单位。LOVB=RES-C-0001
    @Length(max = 10)
    private String orderedFlag; //序列化标识:记录序列化标识，以区分有序资源和无序资源。LOVB=RES-0004
    private Long manageRegionId; //管理区域标识:记录管理区域标识。
    private Date effDate; //生效时间:记录生效时间。
    private Date expDate; //失效时间:记录失效日期。

    public Long getMktResId() {
        return mktResId;
    }

    public void setMktResId(Long mktResId) {
        this.mktResId = mktResId;
    }

    public String getMktResNbr() {
        return mktResNbr;
    }

    public void setMktResNbr(String mktResNbr) {
        this.mktResNbr = mktResNbr;
    }

    public Long getMktResTypeId() {
        return mktResTypeId;
    }

    public void setMktResTypeId(Long mktResTypeId) {
        this.mktResTypeId = mktResTypeId;
    }

    public Long getMktResExttypeId() {
        return mktResExttypeId;
    }

    public void setMktResExttypeId(Long mktResExttypeId) {
        this.mktResExttypeId = mktResExttypeId;
    }

    public String getMktResName() {
        return mktResName;
    }

    public void setMktResName(String mktResName) {
        this.mktResName = mktResName;
    }

    public String getMktResDesc() {
        return mktResDesc;
    }

    public void setMktResDesc(String mktResDesc) {
        this.mktResDesc = mktResDesc;
    }

    public Long getMktPricingPlanId() {
        return mktPricingPlanId;
    }

    public void setMktPricingPlanId(Long mktPricingPlanId) {
        this.mktPricingPlanId = mktPricingPlanId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOrderedFlag() {
        return orderedFlag;
    }

    public void setOrderedFlag(String orderedFlag) {
        this.orderedFlag = orderedFlag;
    }

    public Long getManageRegionId() {
        return manageRegionId;
    }

    public void setManageRegionId(Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
}
