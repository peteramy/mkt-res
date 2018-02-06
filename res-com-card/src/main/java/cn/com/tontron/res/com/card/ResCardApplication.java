package cn.com.tontron.res.com.card;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan({"cn.com.tontron.res.common", "cn.com.tontron.res.card"})
public class ResCardApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResCardApplication.class, args);
    }
}