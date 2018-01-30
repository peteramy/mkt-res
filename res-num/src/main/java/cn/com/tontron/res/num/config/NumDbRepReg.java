package cn.com.tontron.res.num.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class NumDbRepReg {
    @Autowired
    private EntityManager entityManager;
}
