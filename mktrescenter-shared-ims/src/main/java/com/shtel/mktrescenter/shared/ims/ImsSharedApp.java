package com.shtel.mktrescenter.shared.ims;

import com.shtel.mktrescenter.shared.ims.dto.TestDTO;
import com.shtel.paas.sdk.core.PaasBaseException;
import com.shtel.paas.sdk.core.PaasBaseRequest;
import com.shtel.paas.sdk.core.PaasBaseResponse;
import com.shtel.paas.sdk.core.RefreshableRestController;
import com.shtel.paas.sdk.core.web.client.PaasRestTemplate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/test")
    @ApiOperation("test")
    @ResponseBody
    public PaasBaseResponse<TestDTO> test() {
        TestDTO testDto = new TestDTO();
        testDto.setMsg("msg from shared service");
        PaasBaseRequest<TestDTO> req = new PaasBaseRequest<>(testDto);
        //调用服务开始
        //PaasLogger.info("调用业务服务saveSaleOrderDetail{}", req.getBody().paramInfo());
        PaasBaseResponse<TestDTO> result = null;
        try {
            ResponseEntity<PaasBaseResponse<TestDTO>> res =
                    this.restTemplate.exchange(
                            "http://mktresCenterDataIms/mktrescenter/dataservice/ims/test/",
                            HttpMethod.POST,
                            new HttpEntity<PaasBaseRequest<TestDTO>>(req),
                            new ParameterizedTypeReference<PaasBaseResponse<TestDTO>>() {
                            });
            result = new PaasBaseResponse<TestDTO>();
            result.setMsg(res.getBody().getBody().getMsg());
        } catch (Exception e) {
            // 异常信息抛出
            throw new PaasBaseException(e, "00000", "保存失败！");
        }
        return result;
    }
}
