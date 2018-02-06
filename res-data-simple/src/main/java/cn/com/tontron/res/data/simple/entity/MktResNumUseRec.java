package cn.com.tontron.res.data.simple.entity;

import cn.com.tontron.res.data.simple.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yangyang on 2018/1/30.
 * 3.1.29. 营销资源号码使用记录
 * 营销资源号码使用记录。数据量太多，独立分表。按照号码、卡分别建一 套表。
 */
@Table(name = "num_use_rec")
@Entity
public class MktResNumUseRec extends MktModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResNumUseRecId; // 号码使用记录 标识:营销资源使用记录 ID 的标识，主键
    private Long mktResInstId; // 营销资源实例 标识:记录营销资源实例 ID
    @Length(max = 3)
    @Column(length = 3)
    private String objType; // 营销资源使用 对象类型:记录营销资源使用对 象类型:产品实例， 订单项等。LOVB=RES- C-0004
    private Long objId; // 营销资源使用 对象标识: 记录营销资源使用对 象 ID 标 示 ; MKT_RES_OBJ_ID--》 _OBJ_ID
    private Long mktResEventId; // 营销资源库存 变动事件标识: 营销资源库存变动事件标识
    private Date usingTime; // 使用时间
    private Long createPost; // 创建岗位
    private Long createOrgId; // 创建组织标识
    private Long lanId; // 本地网标识
    private Long regionId; // 区域标识

    public Long getMktResNumUseRecId() {
        return mktResNumUseRecId;
    }

    public void setMktResNumUseRecId(Long mktResNumUseRecId) {
        this.mktResNumUseRecId = mktResNumUseRecId;
    }

    public Long getMktResInstId() {
        return mktResInstId;
    }

    public void setMktResInstId(Long mktResInstId) {
        this.mktResInstId = mktResInstId;
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

    public Long getMktResEventId() {
        return mktResEventId;
    }

    public void setMktResEventId(Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    public Date getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(Date usingTime) {
        this.usingTime = usingTime;
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
