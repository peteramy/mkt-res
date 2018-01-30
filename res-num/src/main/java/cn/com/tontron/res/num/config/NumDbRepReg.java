package cn.com.tontron.res.num.config;

import cn.com.tontron.res.common.base.jpa.JpaRepositoryImpl;
import cn.com.tontron.res.num.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class NumDbRepReg {
    @Autowired
    private EntityManager entityManager;

    @Bean(name = "exchNumRelRepo")
    public JpaRepositoryImpl exchNumRelRepo() {
        return new JpaRepositoryImpl(ExchNumRel.class, entityManager);
    }

    @Bean(name = "localHeadRepo")
    public JpaRepositoryImpl localHeadRepo() {
        return new JpaRepositoryImpl(LocalHead.class, entityManager);
    }

    @Bean(name = "mktResAttrFmtRelRepo")
    public JpaRepositoryImpl mktResAttrFmtRelRepo() {
        return new JpaRepositoryImpl(MktResAttrFmtRel.class, entityManager);
    }

    @Bean(name = "mktResCardNumAttrRepo")
    public JpaRepositoryImpl mktResCardNumAttrRepo() {
        return new JpaRepositoryImpl(MktResCardNumAttr.class, entityManager);
    }

    @Bean(name = "mktResNumEventRepo")
    public JpaRepositoryImpl mktResNumEventRepo() {
        return new JpaRepositoryImpl(MktResNumEvent.class, entityManager);
    }

    @Bean(name = "mktResNumEvtDetailRepo")
    public JpaRepositoryImpl mktResNumEvtDetailRepo() {
        return new JpaRepositoryImpl(MktResNumEvtDetail.class, entityManager);
    }

    @Bean(name = "mktResNumFmtCfgRepo")
    public JpaRepositoryImpl mktResNumFmtCfgRepo() {
        return new JpaRepositoryImpl(MktResNumFmtCfg.class, entityManager);
    }

    @Bean(name = "mktResNumInstRepo")
    public JpaRepositoryImpl mktResNumInstRepo() {
        return new JpaRepositoryImpl(MktResNumInst.class, entityManager);
    }

    @Bean(name = "mktResNumPreUseRepo")
    public JpaRepositoryImpl mktResNumPreUseRepo() {
        return new JpaRepositoryImpl(MktResNumPreUse.class, entityManager);
    }

    @Bean(name = "mktResNumUseRecRepo")
    public JpaRepositoryImpl mktResNumUseRecRepo() {
        return new JpaRepositoryImpl(MktResNumUseRec.class, entityManager);
    }

}
