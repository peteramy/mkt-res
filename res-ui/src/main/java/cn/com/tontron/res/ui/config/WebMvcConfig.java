package cn.com.tontron.res.ui.config;

import cn.com.tontron.res.ui.interceptor.MsgInterceptor;
import cn.com.tontron.res.ui.message.SessionMsgHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by yangyang on 2018/1/16.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private ApplicationContext applicationContext;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("login");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MsgInterceptor(applicationContext)).addPathPatterns("/**");
    }

    @Bean
    public SessionMsgHandler sessionMsgHandler() {
        return new SessionMsgHandler();
    }
}
