package cn.com.tontron.res.card.config;

import cn.com.tontron.res.card.entity.*;
import cn.com.tontron.res.common.base.jpa.JpaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * Created by yangyang on 2018/1/30.
 */
@Configuration
@EntityScan({"cn.com.tontron.res.card.entity"})
public class CardDbRepReg {
    @Autowired
    private EntityManager entityManager;

    @Bean(name = "cardNumRelRepo")
    public JpaRepositoryImpl cardNumRelRepo() {
        return new JpaRepositoryImpl(CardNumRel.class, entityManager);
    }

    @Bean(name = "minNbrRepo")
    public JpaRepositoryImpl minNbrRepo() {
        return new JpaRepositoryImpl(MinNbr.class, entityManager);
    }

    @Bean(name = "minNumRelRepo")
    public JpaRepositoryImpl minNumRelRepo() {
        return new JpaRepositoryImpl(MinNumRel.class, entityManager);
    }

    @Bean(name = "minSectionRepo")
    public JpaRepositoryImpl minSectionRepo() {
        return new JpaRepositoryImpl(MinSection.class, entityManager);
    }

    @Bean(name = "mktResCardInstRepo")
    public JpaRepositoryImpl mktResCardInstRepo() {
        return new JpaRepositoryImpl(MktResCardInst.class, entityManager);
    }

    @Bean(name = "mktResCardInstAttrRepo")
    public JpaRepositoryImpl mktResCardInstAttrRepo() {
        return new JpaRepositoryImpl(MktResCardInstAttr.class, entityManager);
    }

    @Bean(name = "mktResCardUseRecRepo")
    public JpaRepositoryImpl mktResCardUseRecRepo() {
        return new JpaRepositoryImpl(MktResCardUseRec.class, entityManager);
    }
}
