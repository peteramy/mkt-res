package cn.com.tontron.res.inv.config;

import cn.com.tontron.res.common.base.jpa.JpaRepositoryImpl;
import cn.com.tontron.res.inv.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * Created by yangyang on 2018/1/19.
 */
@Configuration
@EntityScan({"cn.com.tontron.res.inv.entity"})
public class InvDbRepReg {
    @Autowired
    private EntityManager entityManager;


    @Bean(name = "Repo")
    public JpaRepositoryImpl Repo() {
        return new JpaRepositoryImpl(MktResInvEvent. class,entityManager);
    }

    @Bean(name = "mktResInvEvtDetailRepo")
    public JpaRepositoryImpl mktResInvEvtDetailRepo() {
        return new JpaRepositoryImpl(MktResInvEvtDetail. class,entityManager);
    }

    @Bean(name = "mktResInvInstRepo")
    public JpaRepositoryImpl mktResInvInstRepo() {
        return new JpaRepositoryImpl(MktResInvInst. class,entityManager);
    }

    @Bean(name = "mktResInvInstAttrRepo")
    public JpaRepositoryImpl mktResInvInstAttrRepo() {
        return new JpaRepositoryImpl(MktResInvInstAttr. class,entityManager);
    }

    @Bean(name = "mktResInvUseRecRepo")
    public JpaRepositoryImpl mktResInvUseRecRepo() {
        return new JpaRepositoryImpl(MktResInvUseRec. class,entityManager);
    }
}
