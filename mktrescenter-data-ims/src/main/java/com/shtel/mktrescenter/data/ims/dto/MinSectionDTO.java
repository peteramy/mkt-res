package com.shtel.mktrescenter.data.ims.dto;

import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * Created by yyn on 2018/1/29.
 * 3.1.20. MIN段
 * 描述 MIN 段信息，通常对应 MIN 码中的 M0M1M2M3，在 UIM 卡与移动号码 的混配规则中会使用。
 * 表名从 MIN_INFO 改为 MIN_SECTION，从地域挪过 来的
 */
public class MinSectionDTO extends MktModel { //3.1.20. MIN段
    private Long minInfoId; //MIN 段标识:记录 MIN 段标识。
    private Long hlrId; //网元标识:HLR 标识
    private Long partnerId; //运营商标识:运营商的唯一标识。 PARTY_ROLE_ID 修改 为 PARTNER_ID
    private Long applyRegionId; //适用区域标识:记录适用区域标识。
    @Length(max = 30)
    private String valueFrom; //起始值:记录起始值。
    @Length(max = 30)
    private String endMin; //终止值:记录终止值。
    private Date effDate; //生效时间:生效时间
    private Date expDate; //失效时间:失效时间

    public Long getMinInfoId() {
        return minInfoId;
    }

    public void setMinInfoId(Long minInfoId) {
        this.minInfoId = minInfoId;
    }

    public Long getHlrId() {
        return hlrId;
    }

    public void setHlrId(Long hlrId) {
        this.hlrId = hlrId;
    }

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    public String getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(String valueFrom) {
        this.valueFrom = valueFrom;
    }

    public String getEndMin() {
        return endMin;
    }

    public void setEndMin(String endMin) {
        this.endMin = endMin;
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
