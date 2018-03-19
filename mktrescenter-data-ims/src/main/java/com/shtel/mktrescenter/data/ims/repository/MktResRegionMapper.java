package com.shtel.mktrescenter.data.ims.repository;


import com.shtel.mktrescenter.data.ims.entity.MktResRegion;

import java.util.List;

/**
 * 客户订单 mapper
 *
 * @author yuqing
 */
public interface MktResRegionMapper {
    List<MktResRegion> getResRegion();
    int deleteByPrimaryKey(Long custOrderId);
    int insert(MktResRegion record);
    int insertSelective(MktResRegion record);
    MktResRegion selectByPrimaryKey(Long resId);
    int updateByPrimaryKey(MktResRegion record);
    int updateStatusCdByPrimaryKey(MktResRegion record);


}