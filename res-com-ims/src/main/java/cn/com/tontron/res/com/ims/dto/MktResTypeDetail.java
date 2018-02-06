package cn.com.tontron.res.com.ims.dto;

import cn.com.tontron.res.com.ims.entity.MktResType;
import cn.com.tontron.res.com.ims.entity.MktResTypeAttr;
import cn.com.tontron.res.com.ims.entity.MktResTypeRegion;

import java.util.List;

/**
 * Created by yyn on 2018/1/30.
 * 3.2.1. 营销资源类别详细信息
 * 营销资源类别详细信息，包含营销资源类别主表对象、营销资源类别属性表对象 及营销资源类别适用区域表对象。
 */
public class MktResTypeDetail extends MktResType {
    private List<MktResTypeAttr> mktResTypeAttrs; //营销资源类别属性:营销资源类别属性
    private List<MktResTypeRegion> mktResTypeRegions; //营销资源类别适用区域:营销资源类别适用区域

    public List<MktResTypeAttr> getMktResTypeAttrs() {
        return mktResTypeAttrs;
    }

    public void setMktResTypeAttrs(List<MktResTypeAttr> mktResTypeAttrs) {
        this.mktResTypeAttrs = mktResTypeAttrs;
    }

    public List<MktResTypeRegion> getMktResTypeRegions() {
        return mktResTypeRegions;
    }

    public void setMktResTypeRegions(List<MktResTypeRegion> mktResTypeRegions) {
        this.mktResTypeRegions = mktResTypeRegions;
    }
}