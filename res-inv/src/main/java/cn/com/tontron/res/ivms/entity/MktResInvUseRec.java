package cn.com.tontron.res.ivms.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yyn on 2018/1/29.
 */
@Table(name = "inv_use_rec")
@Entity
public class MktResInvUseRec { //营销资源发票使用记录
    @Length(max = 10)
    private String actType; //通用数据操作类型：通用数据操作类型, KIP=保持/ADD=新增 /MOD=修改/DEL=删除
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mktResUseRecId; //发票使用记录标识：营销资源使用记录 ID 的标识，主键
    private long mktResInvInstId; //营销资源发票实例标识：记录营销资源实例 ID。
    @Length(max = 3)
    private String useSystem; //发票使用系统：记录使用发票的系统 或模块:如计费，自 助终端等。 2015.04.21
    @Length(max = 30)
    private String printNbr; //发票打印流水：记录计费或其他系统打印发票的流水号
    @Length(max = 6)
    private String usedCd; //发票使用状态：记录发票使用的状态:发票打印成功， 未打印发票作废，已 打印普票作废，已打 印增值税专票作废。 LOVB=RES-C-0028
    private long invStaNum; //起始票号：记录当前打印或作废的起始票号。一般需要记录每一张打印或作废的发票，起始票号和结束票号相同;如果是发票未打印作废，一般都是一本发票过期，需要分别记录开始和结束票号。 20150421
    private long invEndNum; //结束票号：记录当前打印或作废的结束票号。一般需要记录每一张打印或作废的发票，起始票号和结束票号相同;如果是发票未打印作废，一般都是一本发票过期，需要分别记录开始和结束票号。
    private Date usingTime; //使用时间：记录使用时间。
    private long usedQuantity; //使用数量：记录使用数量。
    @Length(max = 2000)
    private String remark; //备注：记录备注信息，如发票作废原因，使用记录无效原因。
    private long mktResEventId; //营销资源库存变动事件标识：营销资源库存变动事件标识，记录申请发票作废事件标识
    @Length(max = 10)
    private String statusCd; //状态：记录状态。LOVB=PUB-C-0001。
    private Date statusDate; //状态时间：记录状态变更的时间。
    private long createPost; //创建岗位：记录首次创建的系统岗位标识。
    private long createOrgId; //创建组织标识：记录首次创建的组织机构标识。
    private long createStaff; //创建人：记录首次创建的员工标识。
    private Date createDate; //创建时间：记录首次创建的时间。
    private long updateStaff; //修改人：记录每次修改的员工标识。
    private Date updateDate; //修改时间：记录每次修改的时间。
    private long lanId; //本地网标识：本地网标识。
    private long regionId; //区域标识：指向公共管理区域标识

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType;
    }

    public long getMktResUseRecId() {
        return mktResUseRecId;
    }

    public void setMktResUseRecId(long mktResUseRecId) {
        this.mktResUseRecId = mktResUseRecId;
    }

    public long getMktResInvInstId() {
        return mktResInvInstId;
    }

    public void setMktResInvInstId(long mktResInvInstId) {
        this.mktResInvInstId = mktResInvInstId;
    }

    public String getUseSystem() {
        return useSystem;
    }

    public void setUseSystem(String useSystem) {
        this.useSystem = useSystem;
    }

    public String getPrintNbr() {
        return printNbr;
    }

    public void setPrintNbr(String printNbr) {
        this.printNbr = printNbr;
    }

    public String getUsedCd() {
        return usedCd;
    }

    public void setUsedCd(String usedCd) {
        this.usedCd = usedCd;
    }

    public long getInvStaNum() {
        return invStaNum;
    }

    public void setInvStaNum(long invStaNum) {
        this.invStaNum = invStaNum;
    }

    public long getInvEndNum() {
        return invEndNum;
    }

    public void setInvEndNum(long invEndNum) {
        this.invEndNum = invEndNum;
    }

    public Date getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(Date usingTime) {
        this.usingTime = usingTime;
    }

    public long getUsedQuantity() {
        return usedQuantity;
    }

    public void setUsedQuantity(long usedQuantity) {
        this.usedQuantity = usedQuantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getMktResEventId() {
        return mktResEventId;
    }

    public void setMktResEventId(long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public long getCreatePost() {
        return createPost;
    }

    public void setCreatePost(long createPost) {
        this.createPost = createPost;
    }

    public long getCreateOrgId() {
        return createOrgId;
    }

    public void setCreateOrgId(long createOrgId) {
        this.createOrgId = createOrgId;
    }

    public long getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(long createStaff) {
        this.createStaff = createStaff;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public long getUpdateStaff() {
        return updateStaff;
    }

    public void setUpdateStaff(long updateStaff) {
        this.updateStaff = updateStaff;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public long getLanId() {
        return lanId;
    }

    public void setLanId(long lanId) {
        this.lanId = lanId;
    }

    public long getRegionId() {
        return regionId;
    }

    public void setRegionId(long regionId) {
        this.regionId = regionId;
    }
}
