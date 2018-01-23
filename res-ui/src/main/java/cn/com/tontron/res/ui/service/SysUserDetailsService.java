package cn.com.tontron.res.ui.service;

import cn.com.tontron.res.ui.service.auth.AuthTestService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by yangyang on 2018/1/15.
 */
@Service
@Transactional
public class SysUserDetailsService implements UserDetailsService {
    @Autowired
    private AuthTestService authTestService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        JsonNode node = authTestService.findByUsername(s);
        if (node != null) {
            UserDetail detail = new UserDetail();
            detail.setPassword(node.get("password").asText());
            detail.setUsername(node.get("username").asText());
            return detail;
        }
        return null;
    }

    public class UserDetail implements UserDetails {
        private String username;
        private String password;

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return null;
        }

        @Override
        public String getPassword() {
            return password;
        }

        @Override
        public String getUsername() {
            return username;
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

        public void setPassword(String password) {
            this.password = password;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
