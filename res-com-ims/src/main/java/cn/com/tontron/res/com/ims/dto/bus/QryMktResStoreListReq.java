package cn.com.tontron.res.com.ims.dto.bus;

import cn.com.tontron.res.common.search.PageInfo;

import java.util.List;

/**
 * Created by yangyang on 2018/1/30.
 */
public class QryMktResStoreListReq {
    private String mktResStoreName;// 营销资源仓库名称
    private Long parStoreId;// 上级仓库标识
    private Long recStoreId;// 回收仓库标识
    private String recType; // 回收方式
    private String storeType; // 仓库类型
    private String storeSubType; // 仓库细类
    private String storeGrade; // 仓库层级
    private List<String> statusCds; // 状态
    private PageInfo pageInfo; //分页信息

    public String getMktResStoreName() {
        return mktResStoreName;
    }

    public void setMktResStoreName(String mktResStoreName) {
        this.mktResStoreName = mktResStoreName;
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

    public List<String> getStatusCds() {
        return statusCds;
    }

    public void setStatusCds(List<String> statusCds) {
        this.statusCds = statusCds;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
