package cn.com.tontron.res.num.entity;

import cn.com.tontron.res.common.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/30.
 * 记录号码属性(如号码等级、号码标签)与号码格式的关系信息。这个是规格层面的号码等级范围，在号码实例生成时，号码等级是直接体现在号码实例实体上的;
 */
@Table(name = "num_attr_fmt_rel")
@Entity
public class MktResAttrFmtRel extends MktModel{ //3.1.33. 营销资源属性与格式关系
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResAttrRelId; //营销资源属性与格式关系标识:关系标识
    private Long formatId; //格式标识:格式标识
    private Long mktResId; //营销资源标识:营销资源标识
    private Long attrId; //属性标识:属性标识
    private Long attrValueId; //属性值标识:属性值标识
    private Long applyRegionId; //适用区域标识:记录适用区域标识，指定公共管理区域

    public Long getMktResAttrRelId() {
        return mktResAttrRelId;
    }

    public void setMktResAttrRelId(Long mktResAttrRelId) {
        this.mktResAttrRelId = mktResAttrRelId;
    }

    public Long getFormatId() {
        return formatId;
    }

    public void setFormatId(Long formatId) {
        this.formatId = formatId;
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
