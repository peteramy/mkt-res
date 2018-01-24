package cn.com.tontron.res.ims.config;

import cn.com.tontron.res.common.base.jpa.JpaRepositoryImpl;
import cn.com.tontron.res.ims.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * Created by yangyang on 2018/1/19.
 */
@Configuration
public class ImsDbRepReg {
    @Autowired
    private EntityManager entityManager;

    @Bean(name = "userRepo")
    public JpaRepositoryImpl sysUserRepo() {
        return new JpaRepositoryImpl(SysUser.class, entityManager);
    }
}
