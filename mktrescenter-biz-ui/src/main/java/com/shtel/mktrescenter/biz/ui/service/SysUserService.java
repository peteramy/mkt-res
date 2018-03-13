package com.shtel.mktrescenter.biz.ui.service;

import com.shtel.mktrescenter.biz.ui.dto.req.UserReqDTO;
import com.shtel.mktrescenter.biz.ui.dto.res.UserResDTO;
import com.shtel.paas.sdk.core.PaasBaseException;
import com.shtel.paas.sdk.core.PaasBaseRequest;
import com.shtel.paas.sdk.core.PaasBaseResponse;
import com.shtel.paas.sdk.core.web.client.PaasRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author yangyang
 * @date 2018/3/13
 */
@Service
public class SysUserService implements UserDetailsService {
    @Autowired
    private PaasRestTemplate restTemplate;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserReqDTO reqDTO = new UserReqDTO();
        reqDTO.setUsername(s);
        PaasBaseRequest<UserReqDTO> req = new PaasBaseRequest<>(reqDTO);
        try {
            ResponseEntity<PaasBaseResponse<UserResDTO>> res =
                    this.restTemplate.exchange(
                            "http://mktresCenterDataUi/mktrescenter/dataservice/ui/user/findByName",
                            HttpMethod.POST,
                            new HttpEntity<PaasBaseRequest<UserReqDTO>>(req),
                            new ParameterizedTypeReference<PaasBaseResponse<UserResDTO>>() {
                            });
            return res.getBody().getBody();
        } catch (Exception e) {
            // 异常信息抛出
            throw new PaasBaseException(e, "00000", "用户获取失败！");
        }
    }
}
