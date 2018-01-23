package cn.com.tontron.res.ui.interceptor;

import cn.com.tontron.res.ui.message.SessionMsgHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yangyang on 2018/1/21.
 */
public class MsgInterceptor implements HandlerInterceptor {
    private ApplicationContext applicationContext;

    public MsgInterceptor() {
        super();
    }

    public MsgInterceptor(ApplicationContext applicationContext) {
        super();
        this.applicationContext = applicationContext;
    }

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        httpServletRequest.setAttribute("sessionMsgHandler", applicationContext.getBean(SessionMsgHandler.class));
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
