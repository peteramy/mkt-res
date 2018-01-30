package cn.com.tontron.res.ivms.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yyn on 2018/1/29.
 * 发票作废合并到发票使用记录中，记录每次打印或作废的流水号与票号。 发票打印不触发事件,发票作废需要申请，生成作废事件。
 */
@Table(name = "inv_use_rec")
@Entity
public class MktResInvUseRec extends MktModel { // 3.1.2. 营销资源发票使用记录
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResUseRecId; //发票使用记录标识：营销资源使用记录 ID 的标识，主键
    private Long mktResInvInstId; //营销资源发票实例标识：记录营销资源实例 ID。
    @Length(max = 3)
    @Column(length = 3)
    private String useSystem; //发票使用系统：记录使用发票的系统 或模块:如计费，自 助终端等。 2015.04.21
    @Length(max = 30)
    @Column(length = 30)
    private String printNbr; //发票打印流水：记录计费或其他系统打印发票的流水号
    @Length(max = 6)
    @Column(length = 6)
    private String usedCd; //发票使用状态：记录发票使用的状态:发票打印成功， 未打印发票作废，已 打印普票作废，已打 印增值税专票作废。 LOVB=RES-C-0028
    private Long invStaNum; //起始票号：记录当前打印或作废的起始票号。一般需要记录每一张打印或作废的发票，起始票号和结束票号相同;如果是发票未打印作废，一般都是一本发票过期，需要分别记录开始和结束票号。 20150421
    private Long invEndNum; //结束票号：记录当前打印或作废的结束票号。一般需要记录每一张打印或作废的发票，起始票号和结束票号相同;如果是发票未打印作废，一般都是一本发票过期，需要分别记录开始和结束票号。
    private Date usingTime; //使用时间：记录使用时间。
    private Long usedQuantity; //使用数量：记录使用数量。
    private Long mktResEventId; //营销资源库存变动事件标识：营销资源库存变动事件标识，记录申请发票作废事件标识
    private Long createPost; //创建岗位：记录首次创建的系统岗位标识。
    private Long createOrgId; //创建组织标识：记录首次创建的组织机构标识。
    private Long lanId; //本地网标识：本地网标识。
    private Long regionId; //区域标识：指向公共管理区域标识

    public Long getMktResUseRecId() {
        return mktResUseRecId;
    }

    public void setMktResUseRecId(Long mktResUseRecId) {
        this.mktResUseRecId = mktResUseRecId;
    }

    public Long getMktResInvInstId() {
        return mktResInvInstId;
    }

    public void setMktResInvInstId(Long mktResInvInstId) {
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

    public Long getInvStaNum() {
        return invStaNum;
    }

    public void setInvStaNum(Long invStaNum) {
        this.invStaNum = invStaNum;
    }

    public Long getInvEndNum() {
        return invEndNum;
    }

    public void setInvEndNum(Long invEndNum) {
        this.invEndNum = invEndNum;
    }

    public Date getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(Date usingTime) {
        this.usingTime = usingTime;
    }

    public Long getUsedQuantity() {
        return usedQuantity;
    }

    public void setUsedQuantity(Long usedQuantity) {
        this.usedQuantity = usedQuantity;
    }

    public Long getMktResEventId() {
        return mktResEventId;
    }

    public void setMktResEventId(Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    public Long getCreatePost() {
        return createPost;
    }

    public void setCreatePost(Long createPost) {
        this.createPost = createPost;
    }

    public Long getCreateOrgId() {
        return createOrgId;
    }

    public void setCreateOrgId(Long createOrgId) {
        this.createOrgId = createOrgId;
    }

    public Long getLanId() {
        return lanId;
    }

    public void setLanId(Long lanId) {
        this.lanId = lanId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }
}
