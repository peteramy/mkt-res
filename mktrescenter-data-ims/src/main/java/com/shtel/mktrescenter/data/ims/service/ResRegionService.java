package com.shtel.mktrescenter.data.ims.service;


import com.shtel.mktrescenter.data.ims.entity.MktResRegion;
import com.shtel.mktrescenter.data.ims.repository.MktResRegionMapper;
import com.shtel.paas.sdk.core.log.PaasLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResRegionService {

    @Autowired
    private MktResRegionMapper mktResRegionMapper;


    public List<MktResRegion> getResRegions() {
        return mktResRegionMapper.getResRegion();
    }
}
