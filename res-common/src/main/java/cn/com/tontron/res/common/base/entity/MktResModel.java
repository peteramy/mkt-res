package cn.com.tontron.res.common.base.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by yangyang on 2018/1/29.
 */
@MappedSuperclass
public class MktResModel extends MktModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResInvInstId; // 营销资源发票 实例标识：营销资源实例的标 识，主键
    @Length(max = 250)
    private String mktResInstNbr; // 营销资源实例 编码：记录营销资源实例编 码。
    private Long mktResBatchId; // 资源管理批次 标识：来源于物资管理系统时产生的数据
    private Long mktResId; // 营销资源标识：营销资源标识
    private Long mktResStoreId; // 营销资源仓库 标识：营销资源仓库标识

    public Long getMktResInvInstId() {
        return mktResInvInstId;
    }

    public void setMktResInvInstId(Long mktResInvInstId) {
        this.mktResInvInstId = mktResInvInstId;
    }

    public String getMktResInstNbr() {
        return mktResInstNbr;
    }

    public void setMktResInstNbr(String mktResInstNbr) {
        this.mktResInstNbr = mktResInstNbr;
    }

    public Long getMktResBatchId() {
        return mktResBatchId;
    }

    public void setMktResBatchId(Long mktResBatchId) {
        this.mktResBatchId = mktResBatchId;
    }

    public Long getMktResId() {
        return mktResId;
    }

    public void setMktResId(Long mktResId) {
        this.mktResId = mktResId;
    }

    public Long getMktResStoreId() {
        return mktResStoreId;
    }

    public void setMktResStoreId(Long mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }
}
