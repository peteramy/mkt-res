package cn.com.tontron.res.log.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
@EntityScan({"cn.com.tontron.res.log.entity"})
public class LogDbRepReg {
    @Autowired
    private EntityManager entityManager;
}
