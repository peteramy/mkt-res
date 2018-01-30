package cn.com.tontron.res.card.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yyn on 2018/1/29.
 * 1.营销资源卡使用记录，数据量太多，独立分表。按照号码、卡分别建一 套表。亿迅。
 * 2.修改实体“营销资源卡使用记录”的名称为“营销资源卡信息使用记录”，卡信息没有调拨出入库概念，选卡换卡动作通过使用记录实体描述。20150421。
 */
@Table(name = "card_use_rec")
@Entity
public class MktResCardUseRec extends MktModel { // 3.1.28. 营销资源卡使用记录
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResCardUseRecId; //卡使用记录标识:营销资源使用记录ID的标识，主键
    private Long mktResInstId; //营销资源实例标识:记录营销资源卡实例ID。
    @Length(max = 3)
    private String objType; //营销资源使用对象类型,记录营销资源使用对象类型:产品实例，订单项等。LOVB=RES-C-0004
    private Long objId; //营销资源使用对象标识:记录营销资源使用对象ID标示
    private Date usingTime; //使用时间:记录使用时间。
    private Long createPost; //创建岗位:记录首次创建的系统岗位标识。
    private Long createOrgId; //创建组织标识:记录首次创建的组织机构标识。
    private Long lanId; //本地网标识：本地网标识。
    private Long regionId; //区域标识：指向公共管理区域标识

    public Long getMktResCardUseRecId() {
        return mktResCardUseRecId;
    }

    public void setMktResCardUseRecId(Long mktResCardUseRecId) {
        this.mktResCardUseRecId = mktResCardUseRecId;
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
