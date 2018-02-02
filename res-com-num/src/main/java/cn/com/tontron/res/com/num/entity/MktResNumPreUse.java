package cn.com.tontron.res.com.num.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * Created by yyn on 2018/1/30.
 * 3.1.38. 预选
 * 一般用于 400、800 等号码，记录预选号码的相关信息;
 * 也支撑普通号码预选，例如网厅、自助终端预约选号。
 * 所有的号码预选都存放在该实体中，包括 BSS 中订单、购物车的预选。
 * 预选不触发事件和使用记录。
 * 号码的签发通过预选实体表达，申请人类型为客户经理。
 */
public class MktResNumPreUse extends MktModel {
    private Long mktResNumPreUseId; //营销资源号码预选标识:营销资源使用记录ID的标识，主键
    private Long mktResInstId; //营销资源实例标识:记录营销资源号码实例标识。
    @Length(max = 250)
    private String applicantName; //申请人名称:记录申请人名称。
    @Length(max = 3)
    private String applicantType; //申请人类型:记录申请号码预选的申请人类型。LOVB=RES-C-0033
    private Long applicantId; //申请人标识:记录号码预选的申请人标识，如果是已有客户，记录客户标识;如果是客户经理，记录员工标识。新客户，则为空，根据证件判断。
    @Length(max = 30)
    private String requestNbr; //申请预选流水:记录网厅或其他系统申请预选号码的请求流水号
    @Length(max = 10)
    private String certType; //证件类型:记录申请人证件类型。 LOVB=PTY-0004
    @Length(max = 32)
    private String connectPhone; //联系电话:记录申请人联系电话。
    @Length(max = 30)
    private String certNum; //证件号码:记录申请人证件号码。
    @Length(max = 10)
    private String requestSource; //申请来源:记录申请预选的来源渠道。 LOVB=EVT-C-0001
    private Date effDate; //申请生效时间:记录申请号码预选的生效时间。
    private Date expDate; //失效时间:记录申请号码预选的失效时间。
    private Long lanId; // 本地网标识: 记录本地网标识
    private Long regionId; // 区域标识: 指向公共管理区域标识
    private Long createPost; //创建岗位:记录首次创建的系统岗位标识。
    private Long createOrgId; //创建组织标识:记录首次创建的组织机构标识。

    public Long getMktResNumPreUseId() {
        return mktResNumPreUseId;
    }

    public void setMktResNumPreUseId(Long mktResNumPreUseId) {
        this.mktResNumPreUseId = mktResNumPreUseId;
    }

    public Long getMktResInstId() {
        return mktResInstId;
    }

    public void setMktResInstId(Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    public String getRequestNbr() {
        return requestNbr;
    }

    public void setRequestNbr(String requestNbr) {
        this.requestNbr = requestNbr;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getConnectPhone() {
        return connectPhone;
    }

    public void setConnectPhone(String connectPhone) {
        this.connectPhone = connectPhone;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
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
}
