package cn.com.tontron.res.data.simple.entity;

import cn.com.tontron.res.data.simple.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/29.
 * 3.1.22. 营销资源号码实例属性
 * 记录号码实例属性。
 */
@Table(name = "ims_num_attr")
@Entity
public class MktResCardNumAttr extends MktModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResInstAttrId; //营销资源实例属性标识:记录营销资源实例属性ID
    private Long mktResInstId; //营销资源实例标识:营销资源实例ID的标识
    private Long attrId; // 属性标识:记录属性 ID。
    private Long attrValueId; // 属性值标识:属性值标识
    @Length(max = 30)
    @Column(length = 30)
    private String attrValue; // 属性值:属性值。

    public Long getMktResInstAttrId() {
        return mktResInstAttrId;
    }

    public void setMktResInstAttrId(Long mktResInstAttrId) {
        this.mktResInstAttrId = mktResInstAttrId;
    }

    public Long getMktResInstId() {
        return mktResInstId;
    }

    public void setMktResInstId(Long mktResInstId) {
        this.mktResInstId = mktResInstId;
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
}
