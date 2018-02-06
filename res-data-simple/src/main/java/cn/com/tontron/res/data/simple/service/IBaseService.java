package cn.com.tontron.res.data.simple.service;

import cn.com.tontron.res.common.base.page.TablePage;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by yangyang on 2018/2/6.
 */
public interface IBaseService {
    public TablePage<Object> findAll(HttpServletRequest request) throws IOException;
}
