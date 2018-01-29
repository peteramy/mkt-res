package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/29.
 *描述出入库详细信息，对于有序营销资源，记录营销资源实例的数量变化;对于 无序营销资源，记录营销资源数量的变化
 */
@Table(name = "ims_chng_evt_detail")
@Entity
public class MktResChngEvtDetail extends MktModel{ //营销资源库存变动事件明细
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResChngEvtDetailId; //营销资源库存变动事件明细标识:营销资源库存变动事件明细ID，修改字段名
    private Long mktResEventId; //营销资源库存变动事件标识:营销资源库存变动事件标识
    private Long mktResStoreId; //营销资源仓库标识:营销资源仓库标识，记录事件影响的仓库
    private Long mktResInstId; //营销资源实例标识:营销资源实例标识
    @Length(max = 10)
    private String chngType; //出入库类型:记录出入库类型，LOVB=RES-0006
    private Long quantity; //数量:记录出入库操作的数量
    private Long regionId; // 区域标识: 指向公共管理区域标识
    private Long lanId; // 本地网标识: 记录本地网标识

    public Long getMktResChngEvtDetailId() {
        return mktResChngEvtDetailId;
    }

    public void setMktResChngEvtDetailId(Long mktResChngEvtDetailId) {
        this.mktResChngEvtDetailId = mktResChngEvtDetailId;
    }

    public Long getMktResEventId() {
        return mktResEventId;
    }

    public void setMktResEventId(Long mktResEventId) {
        this.mktResEventId = mktResEventId;
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

    public String getChngType() {
        return chngType;
    }

    public void setChngType(String chngType) {
        this.chngType = chngType;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getLanId() {
        return lanId;
    }

    public void setLanId(Long lanId) {
        this.lanId = lanId;
    }
}
