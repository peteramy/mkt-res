package cn.com.tontron.res.num.dto;

import java.util.Date;

/**
 * Created by yangyang on 2018/1/30.
 * MinNumRel的DTO，与其属性相同
 */
public class MinNumRelDto { // TODO: 通过MQ从card模块获取数据
    private String actType; //通用数据操作类型:通用数据操作类型, KIP=保持/ADD=新增 /MOD=修改/DEL=删除
    private String remark; // 备注
    private Date statusDate; // 状态时间:记录状态变更的时间。
    private String statusCd; // 状态:记录发票实例状态。 LOVB=RES-C-0027
    private Long createStaff; // 创建人:记录首次创建的员工标识。
    private Date createDate; // 创建时间:记录首次创建的时 间。
    private Long updateStaff; // 修改人:记录每次修改的员工标识。
    private Date updateDate; // 修改时间:记录每次修改的时 间。
    private Long minNumRel; // MIN 段与号头 关联标识
    private Long headId; // 号头标识
    private Long minInfoId; // MIN 段标识
    private Long applyRegionId; // 适用区域标识
    private Long lanId;

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public Long getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(Long createStaff) {
        this.createStaff = createStaff;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateStaff() {
        return updateStaff;
    }

    public void setUpdateStaff(Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

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
