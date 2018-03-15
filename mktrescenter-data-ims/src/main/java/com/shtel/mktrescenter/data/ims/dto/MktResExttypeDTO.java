package com.shtel.mktrescenter.data.ims.dto;

import org.hibernate.validator.constraints.Length;

/**
 * Created by yangyang on 2018/1/30.
 * 3.1.48. 营销资源型号
 * 记录外部的营销资源型号，方便配置运营时根据营销资源型号一次生成多个营销资源规格信息。
 */
public class MktResExttypeDTO extends MktModel {
    private Long mktResExttypeId; // 营销资源型号 标识
    @Length(max = 30)
    private String mktResExttypeNbr;// 营销资源型号 编码:记录营销资源编码
    private Long mktResTypeId; // 营销资源类别 标识: 营销资源类别标识
    @Length(max = 250)
    private String mktResExttypeName; // 营销资源型号 名称
    @Length(max = 4000)
    private String mktResExttypeDesc; // 营销资源型号  述
    private Long manageRegionId; // 管理区域标识

    public Long getMktResExttypeId() {
        return mktResExttypeId;
    }

    public void setMktResExttypeId(Long mktResExttypeId) {
        this.mktResExttypeId = mktResExttypeId;
    }

    public String getMktResExttypeNbr() {
        return mktResExttypeNbr;
    }

    public void setMktResExttypeNbr(String mktResExttypeNbr) {
        this.mktResExttypeNbr = mktResExttypeNbr;
    }

    public Long getMktResTypeId() {
        return mktResTypeId;
    }

    public void setMktResTypeId(Long mktResTypeId) {
        this.mktResTypeId = mktResTypeId;
    }

    public String getMktResExttypeName() {
        return mktResExttypeName;
    }

    public void setMktResExttypeName(String mktResExttypeName) {
        this.mktResExttypeName = mktResExttypeName;
    }

    public String getMktResExttypeDesc() {
        return mktResExttypeDesc;
    }

    public void setMktResExttypeDesc(String mktResExttypeDesc) {
        this.mktResExttypeDesc = mktResExttypeDesc;
    }

    public Long getManageRegionId() {
        return manageRegionId;
    }

    public void setManageRegionId(Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }
}
