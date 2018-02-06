package cn.com.tontron.res.data.simple.entity;

import cn.com.tontron.res.data.simple.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yangyang on 2018/1/29.
 * 3.1.23. 营销资源库存变动事件
 * 描述对营销资源的操作事件
 */
@Table(name = "ims_event")
@Entity
public class MktResEvent extends MktModel { // 3.1.23. 营销资源库存变动事件
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResEventId;// 营销资源库 存变动事件 标识:营销资源库存变动事件标识
    @Length(max = 30)
    @Column(length = 30)
    private String mktResEventNbr; // 营销资源库 存事件编码:
    @Length(max = 250)
    @Column(length = 250)
    private String mktResEventName;// 营销资源库 存事件名称
    private Long mktResStoreId; // 营销资源仓 库标识
    private Long destStoreId; // 目标营销资 源仓库
    private Long mktResId; // 营销资源标 识
    @Length(max = 10)
    @Column(length = 10)
    private String objType; // 对象类型: 述触发事件的对 象类型:资源申请 单,订单项等。
    private Long objId; // 对象标识: 记录触发事件的资 源申请单标识、订单 项标识等 20150325
    @Length(max = 6)
    @Column(length = 6)
    private String eventType; // 事件类型:事件类型，记录入 库、出库、调拨、订 单等触发的事件类 型 。 LOVB=RES-C- 0007
    @Length(max = 4000)
    @Column(length = 4000, columnDefinition = "text")
    private String eventDesc; // 事件 述
    private Long partyId; // 经办人标识:
    private Long contactId; // 联系标识: 记录经办人联系标 识
    private Long partyCertId; // 经办人证件 标识:记录二代身份证的 扫 信息。修改为关 联参与人证件标识， CERT_TYPE_ID---》 PARTY_CERT_ID，然 后关联出证件类型 和证件号码
    private Date acceptDate; // 受理时间
    private Long createPost; // 创建岗位
    private Long createOrgId; // 创建组织标 识

    public Long getMktResEventId() {
        return mktResEventId;
    }

    public void setMktResEventId(Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    public String getMktResEventNbr() {
        return mktResEventNbr;
    }

    public void setMktResEventNbr(String mktResEventNbr) {
        this.mktResEventNbr = mktResEventNbr;
    }

    public String getMktResEventName() {
        return mktResEventName;
    }

    public void setMktResEventName(String mktResEventName) {
        this.mktResEventName = mktResEventName;
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

    public Long getMktResId() {
        return mktResId;
    }

    public void setMktResId(Long mktResId) {
        this.mktResId = mktResId;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public Long getObjId() {
        return objId;
    }

    public void setObjId(Long objId) {
        this.objId = objId;
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
