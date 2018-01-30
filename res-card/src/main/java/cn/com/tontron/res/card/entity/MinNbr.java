package cn.com.tontron.res.card.entity;

import cn.com.tontron.res.common.base.entity.MktModel;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/29.
 * 3.1.19. MIN码
 * 描述移动用户识别码信息。
 * 中国电信的 MIN 码共 10 位，其结构如下: 09+M0M1M2M3+ABCD，其中的 M0M1M2M3 和移动电话号码中的 H0H1H2H3 可 存在对应关系。
 * 放在卡的属性上;
 */
@Table(name = "card_min_nbr")
@Entity
public class MinNbr extends MktModel { //3.1.19. MIN码
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
