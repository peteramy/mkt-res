package cn.com.tontron.res.share.inv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ResShareInvApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResShareInvApplication.class, args);
    }
}
