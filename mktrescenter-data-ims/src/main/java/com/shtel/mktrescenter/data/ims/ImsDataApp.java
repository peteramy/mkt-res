package com.shtel.mktrescenter.data.ims;

import com.shtel.mktrescenter.data.ims.dto.MktResRegionDTO;
import com.shtel.mktrescenter.data.ims.entity.MktResRegion;
import com.shtel.mktrescenter.data.ims.service.ResRegionService;
import com.shtel.paas.sdk.core.PaasBaseRequest;
import com.shtel.paas.sdk.core.PaasBaseResponse;
import com.shtel.paas.sdk.core.RefreshableRestController;
import com.shtel.paas.sdk.core.log.PaasLogger;
import com.shtel.paas.sdk.core.mybatis.EnablePaasMybatis;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ImsDataApp class
 *
 * @author yangyang
 * @date 2018/3/8
 */
@Api("营销资源中心数据服务")
@EnablePaasMybatis
@MapperScan("com.shtel.mktrescenter.data.ims.repository")
@RefreshableRestController
@RequestMapping("/mktrescenter/dataservice/ims")
public class ImsDataApp {

    @Autowired
    private ResRegionService resRegionService;

    @GetMapping("/test")
    @ApiOperation("test")
    @ResponseBody
    public PaasBaseResponse<MktResRegionDTO> test() {
        //调用服务开始

        List<MktResRegion> res = resRegionService.getResRegions();
        return null;
    }
}
