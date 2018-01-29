package cn.com.tontron.res.card.entity;

import cn.com.tontron.res.common.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yangyang on 2018/1/29.
 */
@Table(name = "card_min_num_rel")
@Entity
public class MinNumRel extends MktModel { // MIN 段与号头关系
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long minNumRel; // MIN 段与号头 关联标识
    private Long headId; // 号头标识
    private Long minInfoId; // MIN 段标识
    private Long applyRegionId; // 适用区域标识
    private Long lanId; // 本地网标识: 记录号码归属的本地 网

    public Long getMinNumRel() {
        return minNumRel;
    }

    public void setMinNumRel(Long minNumRel) {
        this.minNumRel = minNumRel;
    }

    public Long getHeadId() {
        return headId;
    }

    public void setHeadId(Long headId) {
        this.headId = headId;
    }

    public Long getMinInfoId() {
        return minInfoId;
    }

    public void setMinInfoId(Long minInfoId) {
        this.minInfoId = minInfoId;
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
