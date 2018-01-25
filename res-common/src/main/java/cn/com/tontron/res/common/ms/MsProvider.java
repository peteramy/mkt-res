package cn.com.tontron.res.common.ms;

import cn.com.tontron.res.common.base.entity.ResMs;

import java.lang.annotation.*;

/**
 * Created by yangyang on 2018/1/23.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MsProvider {
    ResMs ms();

    Type type();

    public enum Type {Share, Business, Data} // 数据层的设计有点不靠谱
}
