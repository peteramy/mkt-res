package cn.com.tontron.res.data.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by yangyang on 2018/2/6.
 */
@SpringBootApplication
@EnableScheduling
public class ResDataSimpleApp {
    public static void main(String[] args) {
        SpringApplication.run(ResDataSimpleApp.class, args);
    }
}
