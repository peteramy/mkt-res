package cn.com.tontron.res.ims.dto;

import cn.com.tontron.res.ims.entity.MktResAttr;
import cn.com.tontron.res.ims.entity.MktResExtAttr;
import cn.com.tontron.res.ims.entity.MktResRegion;
import cn.com.tontron.res.ims.entity.MktResource;

import java.util.List;

/**
 * Created by yyn on 2018/1/30.
 * 3.2.3. 营销资源详细信息
 * 营销资源详细信息，包含营销资源主表对象、营销资源属性表对象、营销资源附 加属性表对象、营销资源适用地区表对象。
 */
public class MktResourceDetail extends MktResource {
    private List<MktResAttr> mktResAttrs; //营销资源属性:营销资源属性
    private List<MktResExtAttr> mktResExtAttrs; //营销资源附加属性:营销资源属性
    private List<MktResRegion> mktResRegions; //营销资源适用区域:营销资源适用区域

    public List<MktResAttr> getMktResAttrs() {
        return mktResAttrs;
    }

    public void setMktResAttrs(List<MktResAttr> mktResAttrs) {
        this.mktResAttrs = mktResAttrs;
    }

    public List<MktResExtAttr> getMktResExtAttrs() {
        return mktResExtAttrs;
    }

    public void setMktResExtAttrs(List<MktResExtAttr> mktResExtAttrs) {
        this.mktResExtAttrs = mktResExtAttrs;
    }

    public List<MktResRegion> getMktResRegions() {
        return mktResRegions;
    }

    public void setMktResRegions(List<MktResRegion> mktResRegions) {
        this.mktResRegions = mktResRegions;
    }
}
