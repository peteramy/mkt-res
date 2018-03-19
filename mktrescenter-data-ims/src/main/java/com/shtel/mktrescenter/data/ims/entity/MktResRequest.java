package com.shtel.mktrescenter.data.ims.entity;

import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * Created by yyn on 2018/1/30.
 * 3.1.34. 营销资源申请单
 * 记录申请单的经办人信息、时间要求。通过流程审批。
 */
public class MktResRequest extends MktModel { //3.1.34. 营销资源申请单
    private Long mktResReqId; //营销资源申请单标识:记录营销资源申请单标识
    @Length(max = 30)
    private String reqCode; //申请单编码
    @Length(max = 250)
    private String reqName; //申请单名称
    @Length(max = 10)
    private String reqType; //申请单类型
    @Length(max = 10)
    private String content; //申请单内容描述
    private Long mktResStoreId; //营销资源仓库标识:目标营销资源仓库标识
    private Long destStoreId; //目标营销资源仓库:目标营销资源仓库
    private Date completeDate; //要求完成时间:记录要求完成时间
    private Long lanId; // 本地网标识: 记录本地网标识
    private Long regionId; // 区域标识: 指向公共管理区域标识
    private Long partyId; //经办人标识:记录经办人。修改为关联参与人标识，HANDLER-->PARTY_ID
    private Long contactId; //联系标识:记录经办人联系标识
    private Long partyCertId; //经办人证件标识:记录二代身份证的扫描信息。修改为关联参与人证件标识， CERT_TYPE_ID--- 》PARTY_CERT_ID，然后关联出证件类型和证件号码

    public Long getMktResReqId() {
        return mktResReqId;
    }

    public void setMktResReqId(Long mktResReqId) {
        this.mktResReqId = mktResReqId;
    }

    public String getReqCode() {
        return reqCode;
    }

    public void setReqCode(String reqCode) {
        this.reqCode = reqCode;
    }

    public String getReqName() {
        return reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getMktResStoreId() {
        return mktResStoreId;
    }

    public void setMktResStoreId(Long mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    public Long getDestStoreId() {
        return destStoreId;
    }

    public void setDestStoreId(Long destStoreId) {
        this.destStoreId = destStoreId;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
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

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getPartyCertId() {
        return partyCertId;
    }

    public void setPartyCertId(Long partyCertId) {
        this.partyCertId = partyCertId;
    }
}
