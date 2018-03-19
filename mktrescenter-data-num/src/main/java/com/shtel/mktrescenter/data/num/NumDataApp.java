package com.shtel.mktrescenter.data.num;

import com.shtel.paas.sdk.core.RefreshableRestController;
import com.shtel.paas.sdk.core.mybatis.EnablePaasMybatis;
import io.swagger.annotations.Api;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * NumDataApp class
 *
 * @author yangyang
 * @date 2018/3/19
 */
@Api("营销资源中心数据服务")
@EnablePaasMybatis
@MapperScan("com.shtel.mktrescenter.data.num.repository")
@RefreshableRestController
@RequestMapping("/mktrescenter/dataservice/num")
public class NumDataApp {

}
