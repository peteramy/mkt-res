package cn.com.tontron.res.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan({"cn.com.tontron.res.common",
        "cn.com.tontron.res.ui",

        "cn.com.tontron.res.com.card",
        "cn.com.tontron.res.com.ims",
        "cn.com.tontron.res.com.inv",
        "cn.com.tontron.res.com.num",

        "cn.com.tontron.res.share.card",
        "cn.com.tontron.res.share.ims",
        "cn.com.tontron.res.share.inv",
        "cn.com.tontron.res.share.num",

        "cn.com.tontron.res.bus.card",
        "cn.com.tontron.res.bus.ims",
        "cn.com.tontron.res.bus.inv",
        "cn.com.tontron.res.bus.num"
})
public class ResUiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResUiApplication.class, args);
    }
}
