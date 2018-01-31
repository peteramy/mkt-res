package cn.com.tontron.res.ims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan({"cn.com.tontron.res.common", "cn.com.tontron.res.ims"})
public class ResImsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResImsApplication.class, args);
    }
}
