package cn.com.tontron.res.num.dto;

import cn.com.tontron.res.num.entity.ExchNumRel;

import java.util.List;

/**
 * Created by yangyang on 2018/1/30.
 * 3.2.9. 号码头详细信息
 * 号码头详细信息，包含号码头主表对象及 MIN 段与号头关系对象和局向与 号头关系对象
 */
public class LocalHeadDetail {
    // 由于MinNumRel对象不在该模块中，采用DTO，通过MQ获取值
    private List<MinNumRelDto> minNumRels; // MIN段与号头关系，
    private List<ExchNumRel> exchNumRels;// 局向与号头关系

    public List<MinNumRelDto> getMinNumRels() {
        return minNumRels;
    }

    public void setMinNumRels(List<MinNumRelDto> minNumRels) {
        this.minNumRels = minNumRels;
    }

    public List<ExchNumRel> getExchNumRels() {
        return exchNumRels;
    }

    public void setExchNumRels(List<ExchNumRel> exchNumRels) {
        this.exchNumRels = exchNumRels;
    }
}
