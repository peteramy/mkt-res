package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/30.
 * 3.1.47. 营销资源附加属性
 * 记录营销资源附加属性。
 */
@Table(name = "ims_ext_attr")
@Entity
public class MktResExtAttr extends MktModel{ //3.1.47. 营销资源附加属性
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResAttrValId; //营销资源属性选用值标识:记录营销资源属性选用值标识。
    private Long mktResId; //营销资源标识:营销资源标识
    private Long attrId; //属性标识:记录属性标识。。
    private Long attrValueId; //属性值标识:记录属性值标识。
    @Length(max = 30)
    @Column(length = 30)
    private String attrValue; //属性值:记录附加属性值。
    private Long applyRegionId; //适用区域标识:记录适用区域标识。

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

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    public Long getMktResAttrValId() {

        return mktResAttrValId;
    }

    public void setMktResAttrValId(Long mktResAttrValId) {
        this.mktResAttrValId = mktResAttrValId;
    }
}
