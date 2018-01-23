package cn.com.tontron.res.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ResAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResAuthApplication.class, args);
    }
}
