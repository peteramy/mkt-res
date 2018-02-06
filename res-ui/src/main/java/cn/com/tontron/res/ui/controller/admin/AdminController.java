package cn.com.tontron.res.ui.controller.admin;

import cn.com.tontron.res.ui.controller.UIController;
import cn.com.tontron.res.ui.message.JsonObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdminController extends UIController {
    public static final String PORTAL_PREFIX = "/admin";
    public Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public String getPortalPrefix() {
        return AdminController.PORTAL_PREFIX;
    }

    @ExceptionHandler(Exception.class)
    public void onException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        LOGGER.error(e.getMessage(), e);

        //根据http accept决定返回错误页面或包含错误信息的json数据
        String accept = request.getHeader("Accept");
        if (StringUtils.isEmpty(accept))
            accept = request.getHeader("accept");

        if (accept.contains("json")) {
            handlerJsonException(e, request, response);
            return;
        }
        if (e instanceof RuntimeException) {
            List<String> errList = new ArrayList<>();
            errList.add(e.getMessage());
            request.getSession().setAttribute("global_error", errList);
            return;
        }
        try {
            response.sendError(500);
        } catch (IOException ioexception) {
            LOGGER.error(ioexception.getMessage(), ioexception);
        }
    }

    private void handlerJsonException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "application/json");
        String message = StringUtils.isEmpty(e.getMessage()) ? "未知错误" : e.getMessage();
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(response.getWriter(), JsonObject.error(message));
        } catch (IOException e1) {
            LOGGER.error(e1.getMessage(), e1);
        }
    }
}
