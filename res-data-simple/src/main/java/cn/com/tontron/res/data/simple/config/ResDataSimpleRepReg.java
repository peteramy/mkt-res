package cn.com.tontron.res.data.simple.config;

import cn.com.tontron.res.data.simple.base.jpa.JpaRepositoryImpl;
import cn.com.tontron.res.data.simple.entity.*;
import cn.com.tontron.res.data.simple.entity.auth.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * Created by yangyang on 2018/2/6.
 */
@Configuration
@EntityScan({"cn.com.tontron.res.data.simple.entity"})
public class ResDataSimpleRepReg {
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

    @Bean(name = "mktResAttrRepo")
    public JpaRepositoryImpl mktResAttrRepo() {
        return new JpaRepositoryImpl(MktResAttr.class, entityManager);
    }

    @Bean(name = "mktResAttrValueRepo")
    public JpaRepositoryImpl mktResAttrValueRepo() {
        return new JpaRepositoryImpl(MktResAttrValue.class, entityManager);
    }

    @Bean(name = "mktResBatchRecRepo")
    public JpaRepositoryImpl mktResBatchRecRepo() {
        return new JpaRepositoryImpl(MktResBatchRec.class, entityManager);
    }

    @Bean(name = "mktResBatchRecAttrRepo")
    public JpaRepositoryImpl mktResBatchRecAttrRepo() {
        return new JpaRepositoryImpl(MktResBatchRecAttr.class, entityManager);
    }

    @Bean(name = "mktResChngEvtDetailRepo")
    public JpaRepositoryImpl mktResChngEvtDetailRepo() {
        return new JpaRepositoryImpl(MktResChngEvtDetail.class, entityManager);
    }

    @Bean(name = "mktResEventRepo")
    public JpaRepositoryImpl mktResEventRepo() {
        return new JpaRepositoryImpl(MktResEvent.class, entityManager);
    }

    @Bean(name = "mktResExtAttrRepo")
    public JpaRepositoryImpl mktResExtAttrRepo() {
        return new JpaRepositoryImpl(MktResExtAttr.class, entityManager);
    }

    @Bean(name = "mktResExttypeRepo")
    public JpaRepositoryImpl mktResExttypeRepo() {
        return new JpaRepositoryImpl(MktResExttype.class, entityManager);
    }


    @Bean(name = "mktResExttypeAttrRepo")
    public JpaRepositoryImpl mktResExttypeAttrRepo() {
        return new JpaRepositoryImpl(MktResExttypeAttr.class, entityManager);
    }

    @Bean(name = "mktResExttypeAttrValueRepo")
    public JpaRepositoryImpl mktResExttypeAttrValueRepo() {
        return new JpaRepositoryImpl(MktResExttypeAttrValue.class, entityManager);
    }

    @Bean(name = "mktResGrpRepo")
    public JpaRepositoryImpl mktResGrpRepo() {
        return new JpaRepositoryImpl(MktResGrp.class, entityManager);
    }

    @Bean(name = "mktResGrpResRelRepo")
    public JpaRepositoryImpl mktResGrpResRelRepo() {
        return new JpaRepositoryImpl(MktResGrpResRel.class, entityManager);
    }

    @Bean(name = "mktResInstRepo")
    public JpaRepositoryImpl mktResInstRepo() {
        return new JpaRepositoryImpl(MktResInst.class, entityManager);
    }

    @Bean(name = "mktResInstAttrRepo")
    public JpaRepositoryImpl mktResInstAttrRepo() {
        return new JpaRepositoryImpl(MktResInstAttr.class, entityManager);
    }

    @Bean(name = "mktResInstStoreRepo")
    public JpaRepositoryImpl mktResInstStoreRepo() {
        return new JpaRepositoryImpl(MktResInstStore.class, entityManager);
    }

    @Bean(name = "mktResourceRepo")
    public JpaRepositoryImpl mktResourceRepo() {
        return new JpaRepositoryImpl(MktResource.class, entityManager);
    }

    @Bean(name = "mktResRegionRepo")
    public JpaRepositoryImpl mktResRegionRepo() {
        return new JpaRepositoryImpl(MktResRegion.class, entityManager);
    }

    @Bean(name = "mktResRequestRepo")
    public JpaRepositoryImpl mktResRequestRepo() {
        return new JpaRepositoryImpl(MktResRequest.class, entityManager);
    }

    @Bean(name = "mktResStoreRepo")
    public JpaRepositoryImpl mktResStoreRepo() {
        return new JpaRepositoryImpl(MktResStore.class, entityManager);
    }

    @Bean(name = "mktResStoreAttrRepo")
    public JpaRepositoryImpl mktResStoreAttrRepo() {
        return new JpaRepositoryImpl(MktResStoreAttr.class, entityManager);
    }

    @Bean(name = "mktResStoreObjRelRepo")
    public JpaRepositoryImpl mktResStoreObjRelRepo() {
        return new JpaRepositoryImpl(MktResStoreObjRel.class, entityManager);
    }

    @Bean(name = "mktResStoreRelRepo")
    public JpaRepositoryImpl mktResStoreRelRepo() {
        return new JpaRepositoryImpl(MktResStoreRel.class, entityManager);
    }

    @Bean(name = "mktResTypeRepo")
    public JpaRepositoryImpl mktResTypeRepo() {
        return new JpaRepositoryImpl(MktResType.class, entityManager);
    }

    @Bean(name = "mktResTypeAttrRepo")
    public JpaRepositoryImpl mktResTypeAttrRepo() {
        return new JpaRepositoryImpl(MktResTypeAttr.class, entityManager);
    }

    @Bean(name = "mktResTypeAttrValueRepo")
    public JpaRepositoryImpl mktResTypeAttrValueRepo() {
        return new JpaRepositoryImpl(MktResTypeAttrValue.class, entityManager);
    }

    @Bean(name = "mktResTypeRegionRepo")
    public JpaRepositoryImpl mktResTypeRegionRepo() {
        return new JpaRepositoryImpl(MktResTypeRegion.class, entityManager);
    }

    @Bean(name = "mktResUseRecRepo")
    public JpaRepositoryImpl mktResUseRecRepo() {
        return new JpaRepositoryImpl(MktResUseRec.class, entityManager);
    }

    @Bean(name = "mktResInvEventRepo")
    public JpaRepositoryImpl mktResInvEventRepo() {
        return new JpaRepositoryImpl(MktResInvEvent.class, entityManager);
    }

    @Bean(name = "mktResInvEvtDetailRepo")
    public JpaRepositoryImpl mktResInvEvtDetailRepo() {
        return new JpaRepositoryImpl(MktResInvEvtDetail.class, entityManager);
    }

    @Bean(name = "mktResInvInstRepo")
    public JpaRepositoryImpl mktResInvInstRepo() {
        return new JpaRepositoryImpl(MktResInvInst.class, entityManager);
    }

    @Bean(name = "mktResInvInstAttrRepo")
    public JpaRepositoryImpl mktResInvInstAttrRepo() {
        return new JpaRepositoryImpl(MktResInvInstAttr.class, entityManager);
    }

    @Bean(name = "mktResInvUseRecRepo")
    public JpaRepositoryImpl mktResInvUseRecRepo() {
        return new JpaRepositoryImpl(MktResInvUseRec.class, entityManager);
    }

    @Bean(name = "exchNumRelRepo")
    public JpaRepositoryImpl exchNumRelRepo() {
        return new JpaRepositoryImpl(ExchNumRel.class, entityManager);
    }

    @Bean(name = "localHeadRepo")
    public JpaRepositoryImpl localHeadRepo() {
        return new JpaRepositoryImpl(LocalHead.class, entityManager);
    }

    @Bean(name = "localHlrRepo")
    public JpaRepositoryImpl localHlrRepo() {
        return new JpaRepositoryImpl(LocalHlr.class, entityManager);
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
