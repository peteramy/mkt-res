package cn.com.tontron.res.data.simple.service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yangyang on 2018/2/6.
 */
public interface IBaseService {
    public List<Object> findAll(HttpServletRequest request);
}
