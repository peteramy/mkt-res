package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yyn on 2018/1/29.
 * 使用营销资源的对象,如产品实例，渠道，VIP 客户等。对于不同的使用 对象，针对不同的营销资源，使用方式可能不同。
 * 如对于终端、码号、贵 重礼品都是需要跟踪使用对象的。对于消耗类宣传品，小礼品，只记录使 用的渠道，不具体跟踪详细使用对象。
 */
@Table(name = "ims_use_rec")
@Entity
public class MktResUseRec extends MktModel { //3.1.16. 营销资源使用记录
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResUseRecId; //营销资源使用记录标识:营销资源使用记录ID的标识，主键
    @Length(max = 3)
    @Column(length = 3)
    private String objType; //营销资源使用对象类型:记录营销资源使用对象类型，LOVB=RES-C-0004
    private Long objId; //营销资源使用对象标识:记录营销资源使用对象标识 ,MKT_RES_OBJECT_ID-->OBJ_ID
    @Length(max = 10)
    @Column(length = 10)
    private String orderedFlag; //序列化标识:记录序列化标识:是，否;LOVB=RES-C-0034
    private Long applyObjId; //应用处理对象标识:营销资源标识，对于有序资源，记录营销资源实例标识，对于无序资源，记录营销资源库存标识。
    private Date usingTime; //使用时间:记录使用时间。
    private Long usedQuantity; //使用数量:记录使用数量。
    private Long mktResEventId; //营销资源库存变动事件标识:营销资源库存变动事件标识
    private Long createPost; //创建岗位:记录首次创建的系统岗位标识。
    private Long createOrgId; //创建组织标识:记录首次创建的组织机构标识。
    private Long lanId; //本地网标识：本地网标识。
    private Long regionId; //区域标识：指向公共管理区域标识

    public Long getMktResUseRecId() {
        return mktResUseRecId;
    }

    public void setMktResUseRecId(Long mktResUseRecId) {
        this.mktResUseRecId = mktResUseRecId;
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

    public String getOrderedFlag() {
        return orderedFlag;
    }

    public void setOrderedFlag(String orderedFlag) {
        this.orderedFlag = orderedFlag;
    }

    public Long getApplyObjId() {
        return applyObjId;
    }

    public void setApplyObjId(Long applyObjId) {
        this.applyObjId = applyObjId;
    }

    public Date getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(Date usingTime) {
        this.usingTime = usingTime;
    }

    public Long getUsedQuantity() {
        return usedQuantity;
    }

    public void setUsedQuantity(Long usedQuantity) {
        this.usedQuantity = usedQuantity;
    }

    public Long getMktResEventId() {
        return mktResEventId;
    }

    public void setMktResEventId(Long mktResEventId) {
        this.mktResEventId = mktResEventId;
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
}
