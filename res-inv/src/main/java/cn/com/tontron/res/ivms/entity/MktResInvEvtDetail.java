package cn.com.tontron.res.ivms.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yyn on 2018/1/29.
 */
@Table(name = "inv_evt_detail")
@Entity
public class MktResInvEvtDetail extends MktModel{ //营销资源库存发票变动事件明细
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResChngEvtDetailId; //营销资源库存变动事件明细标识：营销资源库存变动事件明细ID
    private Long mktResStoreId; //营销资源仓库标识：营销资源仓库标识，记录事件影响的仓库。
    private Long mktResInvInstId; //营销资源发票实例标识:营销资源实例标识
    private Long mktResEventId; //营销资源库存 变动事件标识
    private Long invStaNum; //起始票号:记录一本非专票的发票实例的当前第一张票号。
    private Long invEndNum; //结束票号:记录一本非专票的发票实例的最后一张的票号。
    private Long quantity; //数量：记录出入库操作的数量
    @Length(max = 10)
    private String chngType; //出入库类型：记录出入库类型，LOVB=RES-0006
    private Long lanId; //本地网标识：本地网标识。
    private Long regionId; //区域标识：指向公共管理区域标识

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

    public Long getMktResInvInstId() {
        return mktResInvInstId;
    }

    public void setMktResInvInstId(Long mktResInvInstId) {
        this.mktResInvInstId = mktResInvInstId;
    }

    public Long getMktResEventId() {
        return mktResEventId;
    }

    public void setMktResEventId(Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    public Long getInvStaNum() {
        return invStaNum;
    }

    public void setInvStaNum(Long invStaNum) {
        this.invStaNum = invStaNum;
    }

    public Long getInvEndNum() {
        return invEndNum;
    }

    public void setInvEndNum(Long invEndNum) {
        this.invEndNum = invEndNum;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
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
