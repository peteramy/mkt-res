package cn.com.tontron.res.data.simple.entity;

import cn.com.tontron.res.data.simple.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/29.
 * 3.1.27. 局向与号头关系
 * 记录局向与号头关系。
 */
@Table(name = "num_exch_num_rel")
@Entity
public class ExchNumRel extends MktModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long exchNumRelId; //局向与号头关系标识:记录局向与号头关系标识。
    private Long headId; //号头标识:号头标识
    private Long exchId; //局向标识:记录局向 ID。
    private Long applyRegionId; //适用区域标识:记录适用区域标识。
    private Long lanId; // 本地网标识: 记录本地网标识

    public Long getExchNumRelId() {
        return exchNumRelId;
    }

    public void setExchNumRelId(Long exchNumRelId) {
        this.exchNumRelId = exchNumRelId;
    }

    public Long getHeadId() {
        return headId;
    }

    public void setHeadId(Long headId) {
        this.headId = headId;
    }

    public Long getExchId() {
        return exchId;
    }

    public void setExchId(Long exchId) {
        this.exchId = exchId;
    }

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    public Long getLanId() {
        return lanId;
    }

    public void setLanId(Long lanId) {
        this.lanId = lanId;
    }
}
