package cn.com.tontron.res.data.simple.entity;

import cn.com.tontron.res.data.simple.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yangyang on 2018/1/29.
 * 3.1.4. 营销资源发票实例属性
 * 记录营销资源发票实例属性信息。
 */
@Table(name = "inv_ins_attr")
@Entity
public class MktResInvInstAttr extends MktModel { // 3.1.4. 营销资源发票实例属性
    private Long mktResInstAttrId;//营销资源实例 属性标识:记录营销资源实例属 性 ID。
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResInvInstId; // 营销资源发票 实例标识:营销资源实例 ID 的 标识，主键
    private Long attrId; // 属性标识:记录属性 ID。
    private Long attrValueId; // 属性值标识:属性值标识
    @Length(max = 30)
    @Column(length = 30)
    private String attrValue; // 属性值:属性值。
    private Long lanId; // 本地网标识: 本地网
    private Long regionId; // 区域标识: 指向公共管理区域标识

    public Long getMktResInstAttrId() {
        return mktResInstAttrId;
    }

    public void setMktResInstAttrId(Long mktResInstAttrId) {
        this.mktResInstAttrId = mktResInstAttrId;
    }

    public Long getMktResInvInstId() {
        return mktResInvInstId;
    }

    public void setMktResInvInstId(Long mktResInvInstId) {
        this.mktResInvInstId = mktResInvInstId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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
