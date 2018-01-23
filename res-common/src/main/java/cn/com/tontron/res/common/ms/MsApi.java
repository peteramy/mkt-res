package cn.com.tontron.res.common.ms;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * Created by yangyang on 2018/1/23.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MsApi {
    String svcCode() default "";

    String apiCode();
}
