package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yangyang on 2018/1/30.
 * 3.1.50. 营销资源型号属性
 * 记录营销资源型号属性
 */
@Table(name = "ims_exttype")
@Entity
public class MktResExttypeAttr extends MktModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResExttypeAttrId; // 营销资源型 号属性标识: 记录营销资源属性标识
    private Long mktResExttypeId; // 营销资源型 号标识: 营销资源型号标识
    private Long attrId; // 属性标识: 记录属性标识
    @Column(length = 30)
    @Length(max = 30)
    private String defaultValue; // 默认值
    private Long applyRegionId; // 适用区域标 识

    public Long getMktResExttypeAttrId() {
        return mktResExttypeAttrId;
    }

    public void setMktResExttypeAttrId(Long mktResExttypeAttrId) {
        this.mktResExttypeAttrId = mktResExttypeAttrId;
    }

    public Long getMktResExttypeId() {
        return mktResExttypeId;
    }

    public void setMktResExttypeId(Long mktResExttypeId) {
        this.mktResExttypeId = mktResExttypeId;
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

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }
}
