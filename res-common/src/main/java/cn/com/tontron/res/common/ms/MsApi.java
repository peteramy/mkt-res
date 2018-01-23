package cn.com.tontron.res.common.ms;

import java.lang.annotation.*;

/**
 * Created by yangyang on 2018/1/23.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MsApi {
    String svcCode() default "";

    Type type();

    String apiCode();

    public enum Type {Inside, Outside}
}
