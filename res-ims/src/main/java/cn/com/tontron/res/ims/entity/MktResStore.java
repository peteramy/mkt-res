package cn.com.tontron.res.ims.entity;

import cn.com.tontron.res.common.base.entity.MktModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yyn on 2018/1/29.
 */
@Table(name = "ims_store")
@Entity
public class MktResStore extends MktModel { //营销资源仓库
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mktResStoreId; //营销资源仓库标识:营销资源仓库标识
    @Length(max = 30)
    private String mktResStoreNbr; //仓库编码:记录营销资源仓库编码编码。
    @Length(max = 50)
    private String mktResStoreName; //仓库名称:记录仓库名称。
    private Date checkDate; //盘存时间:记录盘存时间。
    private Long parStoreId; //上级仓库标识:记录上级库存标识。UP_STORE_ID -->PAR_STORE_ID。修改为上级仓库标识。
    private Long recStoreId; //回收仓库标识:记录资源回收的目标库存标识。待讨论
    @Length(max = 6)
    private String recType; //回收方式:记录号码的回收方式:本地网回收，管理机构回收，回收池回收，回收池回收并 回放，默认管理机构回收。 LOVB=RES-C-0015
    private Long recDay; //回收期限:记录号码回收期限: 必须输入(天数，默 认 90 天)@20050414
    @Length(max = 6)
    private String storeType; //仓库类型:记录营销资源仓库的类型，LOVB=RES-0001
    @Length(max = 6)
    private String storeSubType; //仓库细类:记录营销资源仓库的小类型，LOVB=RES-C-0003
    @Length(max = 6)
    private String storeGrade; //仓库层级:仓库层级，LOVB=RES-C-0016
    private Date effDate; //生效时间:记录仓库正式启用的时间
    private Date expDate; //失效时间:记录仓库正式失效的时间
    private Long lanId; //本地网标识：本地网标识。
    private Long regionId; //区域标识：指向公共管理区域标识

    public Long getMktResStoreId() {
        return mktResStoreId;
    }

    public void setMktResStoreId(Long mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    public String getMktResStoreNbr() {
        return mktResStoreNbr;
    }

    public void setMktResStoreNbr(String mktResStoreNbr) {
        this.mktResStoreNbr = mktResStoreNbr;
    }

    public String getMktResStoreName() {
        return mktResStoreName;
    }

    public void setMktResStoreName(String mktResStoreName) {
        this.mktResStoreName = mktResStoreName;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Long getParStoreId() {
        return parStoreId;
    }

    public void setParStoreId(Long parStoreId) {
        this.parStoreId = parStoreId;
    }

    public Long getRecStoreId() {
        return recStoreId;
    }

    public void setRecStoreId(Long recStoreId) {
        this.recStoreId = recStoreId;
    }

    public String getRecType() {
        return recType;
    }

    public void setRecType(String recType) {
        this.recType = recType;
    }

    public Long getRecDay() {
        return recDay;
    }

    public void setRecDay(Long recDay) {
        this.recDay = recDay;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getStoreSubType() {
        return storeSubType;
    }

    public void setStoreSubType(String storeSubType) {
        this.storeSubType = storeSubType;
    }

    public String getStoreGrade() {
        return storeGrade;
    }

    public void setStoreGrade(String storeGrade) {
        this.storeGrade = storeGrade;
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
}
