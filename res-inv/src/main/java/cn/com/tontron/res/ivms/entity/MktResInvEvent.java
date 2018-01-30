package cn.com.tontron.res.ivms.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yangyang on 2018/1/29.
 */
@Table(name = "inv_event")
@Entity
public class MktResInvEvent extends MktModel { // 3.1.5. 营销资源库存发票变动事件: 述对发票资源实例的操作事件
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResEventId; // 营销资源库存 变动事件标识:营销资源库存变动事 件标识,主键
    private Long mktResStoreId; // 营销资源仓库 标识:记录事件发生前的营销资源仓库标识
    @Length(max = 30)
    private String mktResEventNbr; // 营销资源库存 事件编码:营销资源库存变动事件编码
    @Length(max = 250)
    private String mktResEventName; // 营销资源库存 事件名称: 记录营销资源库存事件名称名称。
    private Long destStoreId; // 目标营销资源 仓库: 目标营销资源仓库标 识
    private Long objId; // 对象标识: 记录触发事件的资源 申请单标识、订单项 标识等 20150325
    @Length(max = 10)
    private String objType; // 对象类型:  述触发事件的对象 类型:资源申请单,订 单项等。LOVB=RES-C- 0006
    @Length(max = 3)
    private String eventType; // 事件类型:事件类型，记录入库、 出库、调拨、订单等 触发的事件类型， LOVB=RES-C-0024
    @Length(max = 4000)
    private String eventDesc; // 事件 述:记录事件 述信息
    private Long staffId; // 员工标识: 记录经办人。修改为 关联参与人标识， HANDLER-->PARTY_ID
    private Date acceptDate;//受理时间:记录受理时间
    private Long createPost; // 创建岗位:记录首次创建的系统岗位标识。
    private Long createOrgId; // 创建组织标识: 记录首次创建的组织机构标识。

    public Long getMktResEventId() {
        return mktResEventId;
    }

    public void setMktResEventId(Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    public Long getMktResStoreId() {
        return mktResStoreId;
    }

    public void setMktResStoreId(Long mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
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

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
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
