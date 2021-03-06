package com.shtel.mktrescenter.biz.ui.controller.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.shtel.mktrescenter.biz.ui.controller.UIController;
import com.shtel.mktrescenter.biz.ui.message.JsonObject;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminController extends UIController {
    public static final String PORTAL_PREFIX = UIController.PORTAL_PREFIX + "/admin";
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
        if (StringUtils.isEmpty(accept)) {
            accept = request.getHeader("accept");
        }
        if (accept.contains("json")) {
            handlerJsonException(e, request, response);
            return;
        }
        if (e instanceof RuntimeException) {
            request.getSession().setAttribute("global_error", Lists.newArrayList(e.getMessage()));
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
            mapper.writeValue(response.getWriter(), JsonObject.alert(message));
        } catch (IOException e1) {
            LOGGER.error(e1.getMessage(), e1);
        }
    }
}
