package cn.com.tontron.res.ims.config;

import cn.com.tontron.res.common.base.jpa.JpaRepositoryImpl;
import cn.com.tontron.res.ims.entity.*;
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

    @Bean(name = "localHlrRepo")
    public JpaRepositoryImpl localHlrRepo() {
        return new JpaRepositoryImpl(LocalHlr.class, entityManager);
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
}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
