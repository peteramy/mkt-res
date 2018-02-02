package cn.com.tontron.res.share.ims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ResShareImsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResShareImsApplication.class, args);
    }
}
