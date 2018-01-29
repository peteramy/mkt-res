package cn.com.tontron.res.num.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yyn on 2018/1/29.
 */
@Table(name = "num_local_head")
@Entity
public class LocalHead extends MktModel{ //号码头
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long headId; //号头标识:号头标识
    private Long hlrId; //网元标识:HLR标识
    @Length(max = 30)
    private String head; //号头:号头
    @Length(max = 10)
    private String headType; //号头类型:表达不同的号头类型，LOVB=RES-C-0021
    private Long partnerId; //运营商标识:运营商的唯一标识。从EMULATORY_PARTNER_ ID修改为PARTY_ROLE_ID，与 MIN段实体中的运营商标识一致
    private Date effDate; //生效时间:生效时间
    private Date expDate; //失效时间:失效时间
    private Long applyRegionId; //适用区域标识:记录适用区域标识。
    private Long headLen; //号码位长:记录生成号码的长度
    @Length(max = 4000)
    private String createOrderNum; //创建工单号:记录号码字头创建的依据

    public Long getHeadId() {
        return headId;
    }

    public void setHeadId(Long headId) {
        this.headId = headId;
    }

    public Long getHlrId() {
        return hlrId;
    }

    public void setHlrId(Long hlrId) {
        this.hlrId = hlrId;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getHeadType() {
        return headType;
    }

    public void setHeadType(String headType) {
        this.headType = headType;
    }

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
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

    public Long getApplyRegionId() {
        return applyRegionId;
    }

    public void setApplyRegionId(Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    public Long getHeadLen() {
        return headLen;
    }

    public void setHeadLen(Long headLen) {
        this.headLen = headLen;
    }

    public String getCreateOrderNum() {
        return createOrderNum;
    }

    public void setCreateOrderNum(String createOrderNum) {
        this.createOrderNum = createOrderNum;
    }
}
