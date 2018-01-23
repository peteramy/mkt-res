package cn.com.tontron.res.ui.message;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

/**
 * Created by yangyang on 2018/1/21.
 */
public class SessionMsgHandler {
    @Autowired
    private HttpSession session;

    public Object pop(String name) {
        Object o = session.getAttribute(name);
        session.removeAttribute(name);
        return o;
    }
}
