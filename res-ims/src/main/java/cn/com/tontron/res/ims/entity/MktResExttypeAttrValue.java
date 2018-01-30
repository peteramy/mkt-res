package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/30.
 * 3.1.49. 营销资源型号属性选用值
 * 记录营销资源型号属性选用值。
 */
@Table(name = "ims_exttype_attr_value")
@Entity
public class MktResExttypeAttrValue extends MktModel {//3.1.49. 营销资源型号属性选用值
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResExttypeAttrValueId; //营销资源型号属性选用值标识:记录营销资源属性选用值标识。
    private Long mktResExttypeAttrId; //营销资源型号属性标识:记录营销资源属性标识
    private Long attrValueId; //属性值标识:记录属性值标识。
    private Long applyRegionId; //适用区域标识:记录适用区域标识。

    public Long getMktResExttypeAttrValueId() {
        return mktResExttypeAttrValueId;
    }

    public void setMktResExttypeAttrValueId(Long mktResExttypeAttrValueId) {
        this.mktResExttypeAttrValueId = mktResExttypeAttrValueId;
    }

    public Long getMktResExttypeAttrId() {
        return mktResExttypeAttrId;
    }

    public void setMktResExttypeAttrId(Long mktResExttypeAttrId) {
        this.mktResExttypeAttrId = mktResExttypeAttrId;
    }

    public Long getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }
}
