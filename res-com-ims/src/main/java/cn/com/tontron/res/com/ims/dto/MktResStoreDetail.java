package cn.com.tontron.res.com.ims.dto;

import cn.com.tontron.res.com.ims.entity.*;

import java.util.List;

/**
 * Created by yangyang on 2018/1/30.
 * 3.2.4. 营销资源仓库详细信息
 * 营销资源详细信息，包含营销资源仓库主表对象、营销资源仓库属性表对象、营 销资源仓库关系表对象、仓库使用对象表对象、营销资源库存表对象、营销资源 库存变动事件表对象
 */
public class MktResStoreDetail extends MktResStore {
    private List<MktResStoreAttr> mktResStoreAttrs; // 营销资源属性
    private List<MktResStoreRel> mktResStoreRels; // 营销资源仓库 关系
    private List<MktResStoreObjRel> mktResStoreObjRels; // 仓库使用对象
    private List<MktResInstStore> mktResInstStore;// 营销资源库存
    private List<MktResEvent> mktResEvents; // 营销资源库存 变动事件

    public List<MktResStoreAttr> getMktResStoreAttrs() {
        return mktResStoreAttrs;
    }

    public void setMktResStoreAttrs(List<MktResStoreAttr> mktResStoreAttrs) {
        this.mktResStoreAttrs = mktResStoreAttrs;
    }

    public List<MktResStoreRel> getMktResStoreRels() {
        return mktResStoreRels;
    }

    public void setMktResStoreRels(List<MktResStoreRel> mktResStoreRels) {
        this.mktResStoreRels = mktResStoreRels;
    }

    public List<MktResStoreObjRel> getMktResStoreObjRels() {
        return mktResStoreObjRels;
    }

    public void setMktResStoreObjRels(List<MktResStoreObjRel> mktResStoreObjRels) {
        this.mktResStoreObjRels = mktResStoreObjRels;
    }

    public List<MktResInstStore> getMktResInstStore() {
        return mktResInstStore;
    }

    public void setMktResInstStore(List<MktResInstStore> mktResInstStore) {
        this.mktResInstStore = mktResInstStore;
    }

    public List<MktResEvent> getMktResEvents() {
        return mktResEvents;
    }

    public void setMktResEvents(List<MktResEvent> mktResEvents) {
        this.mktResEvents = mktResEvents;
    }
}
