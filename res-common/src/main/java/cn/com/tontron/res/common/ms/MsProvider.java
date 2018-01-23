package cn.com.tontron.res.common.ms;

import java.lang.annotation.*;

/**
 * Created by yangyang on 2018/1/23.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MsProvider {
    String name();

    Type type();

    public enum Type {Inside, Outside}
}
