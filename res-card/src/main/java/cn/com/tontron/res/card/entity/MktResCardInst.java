package cn.com.tontron.res.card.entity;

import cn.com.tontron.res.common.base.entity.MktResModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by yyn on 2018/1/29.
 */
@Table(name = "card_inst")
@Entity
public class MktResCardInst extends MktResModel { //营销资源卡信息实例
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResInstId; //营销资源实例标识:营销资源实例的标识，主键
    private Long prodInstId; //产品实例标识:记录占用的产品实例标识。
    @Length(max = 3)
    private String funType; //功能类型:记录UIM卡功能类型。LOVB=RES-C-0030
    @Length(max = 3)
    private String funSubType; //功能小类:记录UIM卡功能小类。LOVB=RES-C-0031
    @Length(max = 3)
    private String cardStatusCd; //制卡状态:记录UIM卡信息制卡的状态，LOVB=RES-C-0032
    private Long platId; //平台标识:记录来源平台标识，如MSS或集团终端系统
    private Long lanId; //本地网标识：本地网标识。
    private Long regionId; //区域标识：指向公共管理区域标识

    public Long getMktResInstId() {
        return mktResInstId;
    }

    public void setMktResInstId(Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    public Long getProdInstId() {
        return prodInstId;
    }

    public void setProdInstId(Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    public String getFunType() {
        return funType;
    }

    public void setFunType(String funType) {
        this.funType = funType;
    }

    public String getFunSubType() {
        return funSubType;
    }

    public void setFunSubType(String funSubType) {
        this.funSubType = funSubType;
    }

    public String getCardStatusCd() {
        return cardStatusCd;
    }

    public void setCardStatusCd(String cardStatusCd) {
        this.cardStatusCd = cardStatusCd;
    }

    public Long getPlatId() {
        return platId;
    }

    public void setPlatId(Long platId) {
        this.platId = platId;
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
