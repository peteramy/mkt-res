package com.shtel.mktrescenter.data.ui;

import com.shtel.mktrescenter.data.ui.dto.req.UserReqDTO;
import com.shtel.mktrescenter.data.ui.dto.res.UserResDTO;
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

import java.util.Arrays;

/**
 * UiDataApp class
 *
 * @author yangyang
 * @date 2018/3/13
 */
@Api("营销资源中心数据服务")
@EnablePaasMybatis
@MapperScan("com.shtel.mktrescenter.data.ui.repository")
@RefreshableRestController
@RequestMapping("/mktrescenter/dataservice/ui")
public class UiDataApp {
    @PostMapping("/user/findByName")
    @ApiOperation("按用户名查找用户")
    @ResponseBody
    public PaasBaseResponse<UserResDTO> findByName(@RequestBody PaasBaseRequest<UserReqDTO> req) {
        // 调用服务开始
        PaasLogger.info("调用服务按用户名查找用户{}", req.getBody().getUsername());
        UserResDTO userDto = new UserResDTO();
        userDto.setUsername("admin");
        // 123
        userDto.setPassword("202cb962ac59075b964b07152d234b70");
        userDto.setAuthorities(Arrays.asList("admin"));
        userDto.setAccountNonExpired(true);
        userDto.setAccountNonLocked(true);
        userDto.setCredentialsNonExpired(true);
        userDto.setEnabled(true);
        return new PaasBaseResponse<>(userDto);
    }
}
