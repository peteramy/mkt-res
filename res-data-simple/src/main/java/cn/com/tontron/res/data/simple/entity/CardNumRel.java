package cn.com.tontron.res.data.simple.entity;


import cn.com.tontron.res.data.simple.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yangyang on 2018/1/30.
 * 3.1.37. 卡号关系
 * 只记录活卡的信息，即 UIM 卡实体与号码实体的关系;活卡的调拨只针对卡实 例。活卡销售之后触发关系失效
 */
@Table(name = "card_num_rel")
@Entity
public class CardNumRel extends MktModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cardNumRelId; // 卡号关系标 识:MIN 段与号头关联标 识
    private Long mktResCardInstId; // 营销资源卡 实例标识: 营销资源卡实例的标 识
    private Long mktResNumInstId; // 营销资源号 码实例标识
    private Long batchId; // 活卡批次标 识: 活卡批次标识
    private Long applyRegionId; // 适用区域标 识
    private Long lanId; // 本地网标识

    public Long getCardNumRelId() {
        return cardNumRelId;
    }

    public void setCardNumRelId(Long cardNumRelId) {
        this.cardNumRelId = cardNumRelId;
    }

    public Long getMktResCardInstId() {
        return mktResCardInstId;
    }

    public void setMktResCardInstId(Long mktResCardInstId) {
        this.mktResCardInstId = mktResCardInstId;
    }

    public Long getMktResNumInstId() {
        return mktResNumInstId;
    }

    public void setMktResNumInstId(Long mktResNumInstId) {
        this.mktResNumInstId = mktResNumInstId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
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
