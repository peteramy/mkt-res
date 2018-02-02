package cn.com.tontron.res.common.base.entity;

import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * Created by yangyang on 2018/1/29.
 */
public class MktModel {
    @Length(max = 10)
    private String actType; //通用数据操作类型:通用数据操作类型, KIP=保持/ADD=新增 /MOD=修改/DEL=删除
    @Length(max = 2000)
    private String remark; // 备注
    private Date statusDate; // 状态时间:记录状态变更的时间。
    @Length(max = 10)
    private String statusCd; // 状态:记录发票实例状态。 LOVB=RES-C-0027
    private Long createStaff; // 创建人:记录首次创建的员工标识。
    private Date createDate; // 创建时间:记录首次创建的时 间。
    private Long updateStaff; // 修改人:记录每次修改的员工标识。
    private Date updateDate; // 修改时间:记录每次修改的时 间。

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
}
