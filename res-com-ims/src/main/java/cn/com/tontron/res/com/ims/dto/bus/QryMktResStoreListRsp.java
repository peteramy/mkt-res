package cn.com.tontron.res.com.ims.dto.bus;

import cn.com.tontron.res.com.ims.entity.MktResStore;
import cn.com.tontron.res.common.search.PageInfo;

import java.util.List;

/**
 * Created by yangyang on 2018/1/30.
 */
public class QryMktResStoreListRsp {
    private List<MktResStore> mktResStores; //营销资源仓库列表
    private PageInfo pageInfo; // 分页信息

    public List<MktResStore> getMktResStores() {
        return mktResStores;
    }

    public void setMktResStores(List<MktResStore> mktResStores) {
        this.mktResStores = mktResStores;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
