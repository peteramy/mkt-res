package cn.com.tontron.res.ivms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * Created by yangyang on 2018/1/19.
 */
@Configuration
public class IvmsDbRepReg {
    @Autowired
    private EntityManager entityManager;
}
