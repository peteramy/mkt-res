package cn.com.tontron.res.card.entity;

import cn.com.tontron.res.common.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/29.
 */
@Table(name = "card_min_nbr")
@Entity
public class MinNbr extends MktModel{ //MIN码
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long min; //MIN 码:MIN 码
    private Long minInfoId; //MIN 段标识:记录 MIN 段标识。

    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public Long getMinInfoId() {
        return minInfoId;
    }

    public void setMinInfoId(Long minInfoId) {
        this.minInfoId = minInfoId;
    }
}
