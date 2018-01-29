package cn.com.tontron.res.auth.config;

import cn.com.tontron.res.auth.entity.*;
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

    @Bean(name = "authResRepo")
    public JpaRepositoryImpl authResRepo() {
        return new JpaRepositoryImpl(AuthRes.class, entityManager);
    }

    @Bean(name = "authRoleRepo")
    public JpaRepositoryImpl authRoleRepo() {
        return new JpaRepositoryImpl(AuthRole.class, entityManager);
    }

    @Bean(name = "authRoleResRepo")
    public JpaRepositoryImpl authRoleResRepo() {
        return new JpaRepositoryImpl(AuthRoleRes.class, entityManager);
    }

    @Bean(name = "authUserRepo")
    public JpaRepositoryImpl authUserRepo() {
        return new JpaRepositoryImpl(AuthUser.class, entityManager);
    }

    @Bean(name = "authUserRoleRepo")
    public JpaRepositoryImpl authUserRoleRepo() {
        return new JpaRepositoryImpl(AuthUserRole.class, entityManager);
    }
}
