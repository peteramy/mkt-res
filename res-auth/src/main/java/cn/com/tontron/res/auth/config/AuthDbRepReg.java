package cn.com.tontron.res.auth.config;

import cn.com.tontron.res.auth.entity.AuthSysUser;
import cn.com.tontron.res.common.base.jpa.JpaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * Created by yangyang on 2018/1/19.
 */
@Configuration
public class AuthDbRepReg {
    @Autowired
    private EntityManager entityManager;

    @Bean(name = "sysUserRepo")
    public JpaRepositoryImpl sysUserRepo() {
        return new JpaRepositoryImpl(AuthSysUser.class, entityManager);
    }
}
