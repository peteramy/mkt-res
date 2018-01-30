package cn.com.tontron.res.num.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/30.
 * 描述号码格式配置。
 */
@Table(name = "num_fmt_cfg")
@Entity
public class MktResNumFmtCfg extends MktModel { //3.1.32. 号码格式配置
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long formatId; //格式标识:格式标识
    @Length(max = 30)
    @Column(length = 30)
    private String formatNbr; //格式编码:格式编码，例如 AABB/AAA
    @Length(max = 2000)
    @Column(length = 2000, columnDefinition = "text")
    private String formatDesc; //格式描述:格式描述

    public Long getFormatId() {
        return formatId;
    }

    public void setFormatId(Long formatId) {
        this.formatId = formatId;
    }

    public String getFormatNbr() {
        return formatNbr;
    }

    public void setFormatNbr(String formatNbr) {
        this.formatNbr = formatNbr;
    }

    public String getFormatDesc() {
        return formatDesc;
    }

    public void setFormatDesc(String formatDesc) {
        this.formatDesc = formatDesc;
    }
}
