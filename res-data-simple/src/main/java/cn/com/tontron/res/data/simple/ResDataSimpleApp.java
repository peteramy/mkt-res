package cn.com.tontron.res.data.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by yangyang on 2018/2/6.
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan({"cn.com.tontron.res.data.simple", "cn.com.tontron.res.common.component"})
public class ResDataSimpleApp {
    public static void main(String[] args) {
        SpringApplication.run(ResDataSimpleApp.class, args);
    }
}
