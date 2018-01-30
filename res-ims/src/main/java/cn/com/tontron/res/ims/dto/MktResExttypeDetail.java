package cn.com.tontron.res.ims.dto;

import cn.com.tontron.res.ims.entity.MktResExttype;
import cn.com.tontron.res.ims.entity.MktResExttypeAttr;

import java.util.List;

/**
 * Created by yangyang on 2018/1/30.
 * 3.2.2. 营销资源型号详细信息
 * 营销资源型号详细信息，包含营销资源型号主表对象、营销资源型号属性表对 象
 */
public class MktResExttypeDetail extends MktResExttype {
    List<MktResExttypeAttr> mktResExttypeAttrs; // 营销资源型号 属性: 营销资源型号属 性

    public List<MktResExttypeAttr> getMktResExttypeAttrs() {
        return mktResExttypeAttrs;
    }

    public void setMktResExttypeAttrs(List<MktResExttypeAttr> mktResExttypeAttrs) {
        this.mktResExttypeAttrs = mktResExttypeAttrs;
    }
}
