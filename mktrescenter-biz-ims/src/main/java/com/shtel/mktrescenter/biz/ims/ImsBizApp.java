package com.shtel.mktrescenter.biz.ims;

import com.shtel.mktrescenter.biz.ims.dto.TestDto;
import com.shtel.paas.sdk.core.RefreshableRestController;
import com.shtel.paas.sdk.core.log.PaasLogger;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ImsBizApp class
 *
 * @author yangyang
 * @date 2018/3/8
 */
@CrossOrigin
@RefreshableRestController
@RequestMapping("/mktrescenter/portalservice/ims")
public class ImsBizApp {
    @PostMapping("test")
    @ApiOperation("销售单校验服务")
    public TestDto test(@RequestBody TestDto req) {
        // 添加日志，标记业务处理开始。
        PaasLogger.info("test");
        // 售单校验服务
        TestDto res = new TestDto();
        return res;
    }
}
