package cn.com.tontron.res.ims.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * Created by yangyang on 2018/1/19.
 */
@Configuration
public class ImsDbRepReg {
    @Autowired
    private EntityManager entityManager;
}
