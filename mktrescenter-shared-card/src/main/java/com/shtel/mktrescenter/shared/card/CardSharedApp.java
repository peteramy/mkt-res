package com.shtel.mktrescenter.shared.card;

import com.shtel.paas.sdk.core.RefreshableRestController;
import com.shtel.paas.sdk.core.web.client.PaasRestTemplate;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CardSharedApp class
 *
 * @author yangyang
 * @date 2018/3/13
 */
@Api("营销资源中心共享服务")
@CrossOrigin
@RefreshableRestController
@RequestMapping("/mktrescenter/sharedservice/card")
public class CardSharedApp {
    @Autowired
    private PaasRestTemplate restTemplate;
}
