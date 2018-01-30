package cn.com.tontron.res.num.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/30.
 * 3.1.30. 营销资源库存号码变动事件明细
 * 描述号码出入库详细信息，数据量太多，独立分表。按照号码、卡分别建一 套表。
 */
@Table(name = "num_evt_detail")
@Entity
public class MktResNumEvtDetail extends MktModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResChngEvtDetailId; //营销资源库存变动事件明细标识:营销资源库存变动事件明细ID
    private Long mktResStoreId; //营销资源仓库标识:营销资源仓库标识，记录事件影响的仓库
    private Long mktResInstId; //营销资源实例标识:营销资源实例标识
    private Long mktResEventId; //营销资源库存变动事件标识:营销资源库存变动事件标识
    @Length(max = 10)
    @Column(length = 10)
    private String chngType; //出入库类型:记录出入库类型， LOVB=RES-0006
    private Long lanId; // 本地网标识: 记录本地网标识
    private Long regionId; // 区域标识: 指向公共管理区域标识

    public Long getMktResChngEvtDetailId() {
        return mktResChngEvtDetailId;
    }

    public void setMktResChngEvtDetailId(Long mktResChngEvtDetailId) {
        this.mktResChngEvtDetailId = mktResChngEvtDetailId;
    }

    public Long getMktResStoreId() {
        return mktResStoreId;
    }

    public void setMktResStoreId(Long mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    public Long getMktResInstId() {
        return mktResInstId;
    }

    public void setMktResInstId(Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    public Long getMktResEventId() {
        return mktResEventId;
    }

    public void setMktResEventId(Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    public String getChngType() {
        return chngType;
    }

    public void setChngType(String chngType) {
        this.chngType = chngType;
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
