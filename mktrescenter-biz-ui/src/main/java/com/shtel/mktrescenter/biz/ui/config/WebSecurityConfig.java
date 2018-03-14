package com.shtel.mktrescenter.biz.ui.config;

import com.shtel.mktrescenter.biz.ui.controller.UIController;
import com.shtel.mktrescenter.biz.ui.service.SysUserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author yangyang
 * @date 2018/1/16
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SysUserService sysUserService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(sysUserService).passwordEncoder(new PasswordEncoder() {

            @Override
            public String encode(CharSequence rawPassword) {
                return DigestUtils.md5Hex((String) rawPassword);
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                return encodedPassword.equals(DigestUtils.md5Hex((String) rawPassword));
            }
        }); //user Details Service验证
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(UIController.PORTAL_PREFIX + "/", UIController.PORTAL_PREFIX + "/login").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage(UIController.PORTAL_PREFIX + "/login")
                //设置默认登录成功跳转页面
                .defaultSuccessUrl(UIController.PORTAL_PREFIX + "/admin/index").failureUrl(UIController.PORTAL_PREFIX + "/login?error").permitAll()
                .and()
                        //开启cookie保存用户数据
                .rememberMe()
                        //设置cookie有效期
                .tokenValiditySeconds(60 * 60 * 24 * 7)
                        //设置cookie的私钥
                .key("res-sadksde823vdfade")
                .and()
                .logout()
                .logoutUrl(UIController.PORTAL_PREFIX + "/logout")
                .logoutSuccessUrl(UIController.PORTAL_PREFIX + "/login")
                .permitAll();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/temp/**");
    }
}
