package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/29.
 */
@Table(name = "ims_store_atte")
@Entity
public class MktResStoreAttr extends MktModel { //营销资源仓库属性
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long storeAttrId; //营销资源仓库属性标识:记录营销资源仓库属性标识
    private Long mktResStoreId; //营销资源仓库标识:营销资源仓库标识
    private Long attrId; //属性标识:记录属性标识。
    @Length(max = 30)
    private String attrValue; //属性值:记录属性值。

    public Long getStoreAttrId() {
        return storeAttrId;
    }

    public void setStoreAttrId(Long storeAttrId) {
        this.storeAttrId = storeAttrId;
    }

    public Long getMktResStoreId() {
        return mktResStoreId;
    }

    public void setMktResStoreId(Long mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
}
