package com.shtel.mktrescenter.shared.ims;

import com.shtel.mktrescenter.shared.ims.dto.TestDto;
import com.shtel.paas.sdk.core.PaasBaseException;
import com.shtel.paas.sdk.core.PaasBaseRequest;
import com.shtel.paas.sdk.core.PaasBaseResponse;
import com.shtel.paas.sdk.core.RefreshableRestController;
import com.shtel.paas.sdk.core.log.PaasLogger;
import com.shtel.paas.sdk.core.web.client.PaasRestTemplate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ImsSharedApp class
 *
 * @author yangyang
 * @date 2018/3/8
 */
@Api("营销资源中心共享服务")
@CrossOrigin
@RefreshableRestController
@RequestMapping("/mktrescenter/sharedservice/ims")
public class ImsSharedApp {
    @Autowired
    private PaasRestTemplate restTemplate;

    @PostMapping("/test")
    @ApiOperation("test")
    @ResponseBody
    public PaasBaseResponse<TestDto> test(@RequestBody PaasBaseRequest<TestDto> req) {
        //调用服务开始
        PaasLogger.info("调用业务服务saveSaleOrderDetail{}", req.getBody().paramInfo());
        TestDto res;
        try {
            String result = restTemplate.getForObject("http://mktresDataIms/test/", String.class);
            res = new TestDto();
        } catch (Exception e) {
            // 异常信息抛出
            throw new PaasBaseException(e, "00000", "保存失败！");
        }
        return new PaasBaseResponse<>(res);
    }
}
