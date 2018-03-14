package com.shtel.mktrescenter.biz.ui.service;

import com.shtel.paas.sdk.core.web.client.PaasRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author yangyang
 * @date 2018/3/13
 */
@Service
public class SysUserService implements UserDetailsService {
    @Autowired
    private PaasRestTemplate restTemplate;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetail userDetail = new UserDetail();
        return userDetail;
    }

    /* 调用中心内部服务样例，由于接入统一认证，认证需要重新处理
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
    */

    public class UserDetail implements UserDetails {
        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            List<GrantedAuthority> authorityList = new ArrayList<>();
            authorityList.add(new SimpleGrantedAuthority("admin"));
            return authorityList;
        }

        @Override
        public String getPassword() {
            // 123
            return "202cb962ac59075b964b07152d234b70";
        }

        @Override
        public String getUsername() {
            return "admin";
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }
}
