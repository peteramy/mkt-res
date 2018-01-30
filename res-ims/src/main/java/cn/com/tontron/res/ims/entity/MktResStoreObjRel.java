package cn.com.tontron.res.ims.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yyn on 2018/1/30.
 * 1.记录仓库与组织关系。仓库与组织下的员工的权限关系在员工子域配置。
 * 2.修改实体“仓库与组织关系”的名称为“仓库使用对象”, 表名称修改: MKT_RES_STORE_ORG_REL-->MKT_RES_STORE_OBJ_REL。
 * 3.对于虚拟仓库，扩充使用对象类型，包括组织、销售品、人员、系统。
 * 4.管理关系挪至员工子域，通过权限管理。当前实体只记录仓库的使用关系。
 */
@Table(name = "ims_store_obj_rel")
@Entity
public class MktResStoreObjRel { //3.1.35. 仓库使用对象
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResStoreObjRelId; //仓库与组织关系标识:记录仓库与组织关系标识。
    private Long mktResStoreId; //营销资源仓库标识:营销资源仓库标识
    @Length(max = 10)
    private String objType; //使用对象类型:记录仓库的使用对象类型，LOVB=RES-C-0025
    private Long objId; //记录使用对象标识，组织标识，销售品标识，员工标识，系统标识等等。 20150421。
    private Long regionId; // 区域标识: 指向公共管理区域标识
    private Long isDefault; //是否默认:是否默认使用对象，区分一个仓库可以关联多个使用对象，但是要区分是否默认的
    @Length(max = 10)
    private String useMktType; //使用资源范围:限制能够使用的营销资源类别、营销资源，或者所有，LOVB=RES-C-0038
    private Long useMktId; //使用资源标识:限制使用的具体的营销资源类别标识或者营销资源标识
    @Length(max = 10)
    @Column(length = 10)
    private String actType; //通用数据操作类型:通用数据操作类型, KIP=保持/ADD=新增 /MOD=修改/DEL=删除
    @Length(max = 2000)
    @Column(length = 2000, columnDefinition = "text")
    private String remark; // 备注
    @Length(max = 10)
    @Column(length = 10)
    private String statusCd; // 状态:记录发票实例状态。 LOVB=RES-C-0027
    private Long createStaff; // 创建人:记录首次创建的员工标识。
    private Date createDate; // 创建时间:记录首次创建的时 间。
    private Long updateStaff; // 修改人:记录每次修改的员工标识。
    private Date updateDate; // 修改时间:记录每次修改的时 间。


    public Long getMktResStoreObjRelId() {
        return mktResStoreObjRelId;
    }

    public void setMktResStoreObjRelId(Long mktResStoreObjRelId) {
        this.mktResStoreObjRelId = mktResStoreObjRelId;
    }

    public Long getMktResStoreId() {
        return mktResStoreId;
    }

    public void setMktResStoreId(Long mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public Long getObjId() {
        return objId;
    }

    public void setObjId(Long objId) {
        this.objId = objId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Long isDefault) {
        this.isDefault = isDefault;
    }

    public String getUseMktType() {
        return useMktType;
    }

    public void setUseMktType(String useMktType) {
        this.useMktType = useMktType;
    }

    public Long getUseMktId() {
        return useMktId;
    }

    public void setUseMktId(Long useMktId) {
        this.useMktId = useMktId;
    }

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
