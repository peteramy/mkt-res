package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yangyang on 2018/1/29.
 */
@Table(name = "ims_attr")
@Entity
public class MktResAttr extends MktModel {// 3.1.8. 营销资源属性
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResAttrId; // 营销资源属性 标识:记录营销资源属性标识。
    private Long mktResId; // 营销资源标识: 记录营销资源标识
    private Long attrId; // 属性标识: 记录属性标识
    private String defaultValue; // 默认值
    private String applyRegionId; // 适用区域标识: 记录适用区域标识

    public Long getMktResAttrId() {
        return mktResAttrId;
    }

    public void setMktResAttrId(Long mktResAttrId) {
        this.mktResAttrId = mktResAttrId;
    }

    public Long getMktResId() {
        return mktResId;
    }

    public void setMktResId(Long mktResId) {
        this.mktResId = mktResId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(String applyRegionId) {
        this.applyRegionId = applyRegionId;
    }
}
