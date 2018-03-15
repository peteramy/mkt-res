package com.shtel.mktrescenter.data.ims.dto;

import org.hibernate.validator.constraints.Length;

/**
 * Created by yyn on 2018/1/30.
 * 3.1.36. 归属 HLR
 * 记录归属 HLR 网元信息。
 */
public class LocalHlrDTO extends MktModel{ //3.1.36. 归属 HLR
    private Long hlrId; //网元标识:HLR 标识
    @Length(max = 250)
    private String hlrName; //网元名称:网元名称
    @Length(max = 10)
    private String hlrType; //网元类型:记录网元类型
    @Length(max = 32)
    private String hlrNbr; //网元编码:记录网元编码
    private Long regionId; // 区域标识: 指向公共管理区域标识
    private Long lanId; // 本地网标识: 记录本地网标识

    public Long getHlrId() {
        return hlrId;
    }

    public void setHlrId(Long hlrId) {
        this.hlrId = hlrId;
    }

    public String getHlrName() {
        return hlrName;
    }

    public void setHlrName(String hlrName) {
        this.hlrName = hlrName;
    }

    public String getHlrType() {
        return hlrType;
    }

    public void setHlrType(String hlrType) {
        this.hlrType = hlrType;
    }

    public String getHlrNbr() {
        return hlrNbr;
    }

    public void setHlrNbr(String hlrNbr) {
        this.hlrNbr = hlrNbr;
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
