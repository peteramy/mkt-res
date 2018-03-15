package com.shtel.mktrescenter.data.ims.dto;

import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * Created by yangyang on 2018/1/29.
 * 3.1.17. 营销资源号码实例
 * 记录号码类营销资源实例信息。营销资源实例编码，记录号码。 号码实例独立成表原因:数量较多，使用比较频繁，管理方式差异较大。
 */
public class MktResNumInstDTO extends MktResModel {
    private Long mktResInstId; // 营销资源实例 标识:营销资源实例标识
    private Long headId; // 号头标识
    private Long depositAmount; // 预存金额:营销资源实例的零售 价格，记录号码要求 的预存费，单位为分
    private Long minConsume; // 号码低消费用:记录号码要求的最低消费金额。
    @Length(max = 30)
    private String numLevel; // 号码等级
    @Length(max = 10)
    private String numActType; // 号码业务类型:记录号码业务类型， 用于区分物理号码、 逻辑号码
    private Long platId; // 平台标识:记录来源平台标识， 如 MSS 或集团终端系 统
    private Long regionId; // 区域标识: 指向公共管理区域标识
    private Long lanId; // 本地网标识: 记录本地网标识
    private Long prodInstId; // 产品实例标识: 记录占用的产品实例标识
    @Length(max = 10)
    private String keepObjType; // 预留对象类型:记录预留对象类型， LOVB=RES-C-0018
    private Long keepObjId; // 预留对象标识:记录预留对象标识
    private Date keepStartDate; //预留起始时间:记录预留起始时间
    private Date keepEndDate; // 预留结束时间: 记录预留结束时间
    private Long hlrId; // 网元标识: 归属 HLR 标识
    @Length(max = 3)
    private String highGradeFlag; // 靓号标志:记录优质号码标志， LOVB=PUB-C-0006
    @Length(max = 6)
    private String signCd; // 签发状态:记录签发状态，签发 功能只针对优质号码 使用，优质签发人、 单位、批准人、说明 放在号码实例属性 中。LOVB=RES-C-0029

    public Long getMktResInstId() {
        return mktResInstId;
    }

    public void setMktResInstId(Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    public Long getHeadId() {
        return headId;
    }

    public void setHeadId(Long headId) {
        this.headId = headId;
    }

    public Long getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Long depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Long getMinConsume() {
        return minConsume;
    }

    public void setMinConsume(Long minConsume) {
        this.minConsume = minConsume;
    }

    public String getNumLevel() {
        return numLevel;
    }

    public void setNumLevel(String numLevel) {
        this.numLevel = numLevel;
    }

    public String getNumActType() {
        return numActType;
    }

    public void setNumActType(String numActType) {
        this.numActType = numActType;
    }

    public Long getPlatId() {
        return platId;
    }

    public void setPlatId(Long platId) {
        this.platId = platId;
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

    public Long getProdInstId() {
        return prodInstId;
    }

    public void setProdInstId(Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    public String getKeepObjType() {
        return keepObjType;
    }

    public void setKeepObjType(String keepObjType) {
        this.keepObjType = keepObjType;
    }

    public Long getKeepObjId() {
        return keepObjId;
    }

    public void setKeepObjId(Long keepObjId) {
        this.keepObjId = keepObjId;
    }

    public Date getKeepStartDate() {
        return keepStartDate;
    }

    public void setKeepStartDate(Date keepStartDate) {
        this.keepStartDate = keepStartDate;
    }

    public Date getKeepEndDate() {
        return keepEndDate;
    }

    public void setKeepEndDate(Date keepEndDate) {
        this.keepEndDate = keepEndDate;
    }

    public Long getHlrId() {
        return hlrId;
    }

    public void setHlrId(Long hlrId) {
        this.hlrId = hlrId;
    }

    public String getHighGradeFlag() {
        return highGradeFlag;
    }

    public void setHighGradeFlag(String highGradeFlag) {
        this.highGradeFlag = highGradeFlag;
    }

    public String getSignCd() {
        return signCd;
    }

    public void setSignCd(String signCd) {
        this.signCd = signCd;
    }
}
