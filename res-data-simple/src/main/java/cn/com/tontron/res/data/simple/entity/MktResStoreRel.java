package cn.com.tontron.res.data.simple.entity;

import cn.com.tontron.res.data.simple.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yangyang on 2018/1/30.
 * 3.1.42. 营销资源仓库关系
 * 记录营销资源仓库之间除上下级以外的其它关系。
 */
@Table(name = "ims_store_rel")
@Entity
public class MktResStoreRel extends MktModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResStoreRelId; // 营销资源仓 库关系标识:主键，营销资源仓库关系标 识
    private Long aMktResStoreId; // A 端营销资源 仓库标识
    private Long zMktResStoreId; // Z 端营销资源 仓库标识
    @Length(max = 10)
    @Column(length = 10)
    private String relType; // 关系类型: 记录营销资源仓库之间的 关系,LOVB=RES-C-0014
    @Length(max = 10)
    @Column(length = 10)
    private String relTypeDom; // 关系范围: 限制营销资源仓库关系的 范围，LOVB=RES-C-0039
    private Long relDomId; // 限制存在关系的两个营销 资源仓库之间的具体的营 销资源类别或者营销资源

    public Long getMktResStoreRelId() {
        return mktResStoreRelId;
    }

    public void setMktResStoreRelId(Long mktResStoreRelId) {
        this.mktResStoreRelId = mktResStoreRelId;
    }

    public Long getaMktResStoreId() {
        return aMktResStoreId;
    }

    public void setaMktResStoreId(Long aMktResStoreId) {
        this.aMktResStoreId = aMktResStoreId;
    }

    public Long getzMktResStoreId() {
        return zMktResStoreId;
    }

    public void setzMktResStoreId(Long zMktResStoreId) {
        this.zMktResStoreId = zMktResStoreId;
    }

    public String getRelType() {
        return relType;
    }

    public void setRelType(String relType) {
        this.relType = relType;
    }

    public String getRelTypeDom() {
        return relTypeDom;
    }

    public void setRelTypeDom(String relTypeDom) {
        this.relTypeDom = relTypeDom;
    }

    public Long getRelDomId() {
        return relDomId;
    }

    public void setRelDomId(Long relDomId) {
        this.relDomId = relDomId;
    }
}
