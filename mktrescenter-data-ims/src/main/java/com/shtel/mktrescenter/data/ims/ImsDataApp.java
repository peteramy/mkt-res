package com.shtel.mktrescenter.data.ims;

import com.shtel.mktrescenter.data.ims.dto.TestDto;
import com.shtel.paas.sdk.core.PaasBaseRequest;
import com.shtel.paas.sdk.core.PaasBaseResponse;
import com.shtel.paas.sdk.core.RefreshableRestController;
import com.shtel.paas.sdk.core.log.PaasLogger;
import com.shtel.paas.sdk.core.mybatis.EnablePaasMybatis;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @PostMapping("/test")
    @ApiOperation("test")
    @ResponseBody
    public PaasBaseResponse<TestDto> test(@RequestBody PaasBaseRequest<TestDto> req) {
        //调用服务开始
        PaasLogger.info("调用服务test{}", req.getBody().paramInfo());
        TestDto res = new TestDto();
        return new PaasBaseResponse<>(res);
    }
}
