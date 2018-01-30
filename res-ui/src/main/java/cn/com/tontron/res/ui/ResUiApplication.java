package cn.com.tontron.res.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan({"cn.com.tontron.res.ui",
        "cn.com.tontron.res.common",
        "cn.com.tontron.res.auth",
        "cn.com.tontron.res.card",
        "cn.com.tontron.res.ims",
        "cn.com.tontron.res.inv",
        "cn.com.tontron.res.logis",
        "cn.com.tontron.res.num",
        "cn.com.tontron.res.other",
        "cn.com.tontron.res.term"
})
public class ResUiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResUiApplication.class, args);
    }
}
