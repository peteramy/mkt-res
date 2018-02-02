package cn.com.tontron.res.com.num.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * Created by yangyang on 2018/1/30.
 * 3.1.31. 营销资源库存号码变动事件
 * 1. 述对营销资源号码的操作事件。数据量太多，独立分表。按照号码、卡分别 建一套表。
 * 2.增加字段:营销资源实例标识，记录预占一个号码时的号码实例标识，不用产 生 事件明细;在一批号码调拨时才使用事件明细。
 * 3.客户或客户经理发起的号码预选不生成事件，直接在预选实体中记录;
 */
public class MktResNumEvent extends MktModel {
    private Long mktResEventId; // 营销资源库 存变动事件 标识
    @Length(max = 250)
    private String mktResEventName; // 营销资源库 存事件名称:记录营销资源库存事件名称
    @Length(max = 30)
    private String mktResEventNbr; // 营销资源库 存事件编码: 营销资源库存变动事件编码
    private Long mktResStoreId; // 营销资源仓 库标识: 营销资源仓库标识
    private Long destStoreId; // 目标营销资 源仓库
    private Long objId;// 对象标识: 记录触发事件的资源申请单标识、订单项标识等 20150325
    @Length(max = 10)
    private String objType; // 对象类型:  述触发事件的对象类型: 资源申请单,订单项等。 LOVB=RES-C-0006
    @Length(max = 3)
    private String eventType; // 事件类型: 记录号码事件类型。 LOVB=RES-C-0019
    @Length(max = 4000)
    private String eventDesc; // 事件 述
    private Long mktResInstId; // 营销资源实 例标识: 记录预占一个号码时的号码实例标识，不用产生事件明细;在一批号码调拨时才使用事件明细
    private Long partyId; // 经办人标识
    private Long contactId; // 联系标识
    private Long partyCertId; // 经办人证件 标识:记录二代身份证的扫 信 息。修改为关联参与人证件 标 识 ， CERT_REC_ID-- 》 PARTY_CERT_ID，然后关联出 证件类型和证件号码
    private Date acceptDate;// 受理时间
    private Long createPost; // 创建岗位
    private Long createOrgId; // 创建组织标 识

    public Long getMktResEventId() {
        return mktResEventId;
    }

    public void setMktResEventId(Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    public String getMktResEventName() {
        return mktResEventName;
    }

    public void setMktResEventName(String mktResEventName) {
        this.mktResEventName = mktResEventName;
    }

    public String getMktResEventNbr() {
        return mktResEventNbr;
    }

    public void setMktResEventNbr(String mktResEventNbr) {
        this.mktResEventNbr = mktResEventNbr;
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

    public Long getObjId() {
        return objId;
    }

    public void setObjId(Long objId) {
        this.objId = objId;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public Long getMktResInstId() {
        return mktResInstId;
    }

    public void setMktResInstId(Long mktResInstId) {
        this.mktResInstId = mktResInstId;
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

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Long getCreatePost() {
        return createPost;
    }

    public void setCreatePost(Long createPost) {
        this.createPost = createPost;
    }

    public Long getCreateOrgId() {
        return createOrgId;
    }

    public void setCreateOrgId(Long createOrgId) {
        this.createOrgId = createOrgId;
    }
}
