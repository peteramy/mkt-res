package cn.com.tontron.res.data.simple.base.search;

import cn.com.tontron.res.data.simple.base.jpa.DSLPageRequest;

/**
 * Created by yangyang on 2018/2/6.
 */
public interface IQueryDslPage {
    public DSLPageRequest asDslPageRequest();
}
