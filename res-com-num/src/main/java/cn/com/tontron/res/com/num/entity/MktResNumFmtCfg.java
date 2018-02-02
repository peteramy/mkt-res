package cn.com.tontron.res.com.num.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

/**
 * Created by yyn on 2018/1/30.
 * 3.1.32. 号码格式配置
 * 描述号码格式配置。
 */
public class MktResNumFmtCfg extends MktModel {
    private Long formatId; //格式标识:格式标识
    @Length(max = 30)
    private String formatNbr; //格式编码:格式编码，例如 AABB/AAA
    @Length(max = 2000)
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
