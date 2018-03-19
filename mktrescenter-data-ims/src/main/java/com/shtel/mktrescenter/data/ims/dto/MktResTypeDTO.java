package com.shtel.mktrescenter.data.ims.dto;

import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * Created by yangyang on 2018/1/29.
 * 3.1.11. 营销资源类别
 * 记录了营销资源的类别。MKT_RESOURCE_TYPE--》MKT_RES_TYPE
 */
public class MktResTypeDTO extends MktModel {
    private Long mktResTypeId; // 营销资源类别 标识:营销资源 CD 的标识，主 键
    @Length(max = 10)
    private String mktResTypeNbr; // 营销资源类别 编码: 记录营销资源类别编 码，LOVB=RES-0003
    @Length(max = 32)
    private String mktResTypeName; // 营销资源类别 名称:营销资源类别名称
    @Length(max = 2000)
    private String mktResTypeDesc; // 营销资源类别  述:记录营销资源类别  述
    @Length(max = 10)
    private String orderedFlag; // 序列化标识:记录序列化标识，以区 分有序资源和无序资 源。LOVB=RES-C-0034
    private Long parTypeId; // 上级类别标识:记录营销资源上级类别 CD
    private Long manageRegionId; // 管理区域标识:记录管理区域标识。
    private Date effDate; // 生效时间
    private Date expDate;// 失效时间

    public Long getMktResTypeId() {
        return mktResTypeId;
    }

    public void setMktResTypeId(Long mktResTypeId) {
        this.mktResTypeId = mktResTypeId;
    }

    public String getMktResTypeNbr() {
        return mktResTypeNbr;
    }

    public void setMktResTypeNbr(String mktResTypeNbr) {
        this.mktResTypeNbr = mktResTypeNbr;
    }

    public String getMktResTypeName() {
        return mktResTypeName;
    }

    public void setMktResTypeName(String mktResTypeName) {
        this.mktResTypeName = mktResTypeName;
    }

    public String getMktResTypeDesc() {
        return mktResTypeDesc;
    }

    public void setMktResTypeDesc(String mktResTypeDesc) {
        this.mktResTypeDesc = mktResTypeDesc;
    }

    public String getOrderedFlag() {
        return orderedFlag;
    }

    public void setOrderedFlag(String orderedFlag) {
        this.orderedFlag = orderedFlag;
    }

    public Long getParTypeId() {
        return parTypeId;
    }

    public void setParTypeId(Long parTypeId) {
        this.parTypeId = parTypeId;
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
