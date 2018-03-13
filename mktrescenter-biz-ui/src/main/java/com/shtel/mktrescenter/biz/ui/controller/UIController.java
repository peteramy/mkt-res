package com.shtel.mktrescenter.biz.ui.controller;

import com.shtel.mktrescenter.biz.ui.binder.DatePropertyEditor;
import com.shtel.mktrescenter.biz.ui.binder.DateRange;
import com.shtel.mktrescenter.biz.ui.binder.DateRangePropertyEditor;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class UIController {
    public static final String PORTAL_PREFIX = "";
    protected static Logger logger = LoggerFactory.getLogger(UIController.class);
    protected String contextPath = "/";
    @Resource
    private ApplicationContext applicationContext;

    public UIController() {
    }

    @InitBinder
    public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
        String[] fmt = new String[]{"yyyy-MM-dd", "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm:ss"};
        binder.registerCustomEditor(Date.class, new DatePropertyEditor("yyyy-MM-dd HH:mm:ss", fmt));
        binder.registerCustomEditor(DateRange.class, new DateRangePropertyEditor("-", "yyyy-MM-dd HH:mm:ss", fmt));
        this.doInitBinder(request, binder);
        this.contextPath = request.getContextPath();
    }

    public void saveError(HttpSession session, String error) {
        this.add(session, "global_error", error);
    }

    public void saveMessage(HttpSession session, String message) {
        this.add(session, "global_message", message);
    }

    public void saveSuccess(HttpSession session, String message) {
        this.add(session, "global_success", message);
    }

    protected void add(HttpSession session, String key, String message) {
        Object list = new ArrayList();
        if (session.getAttribute(key) != null && session.getAttribute(key) instanceof List) {
            list = (List) session.getAttribute(key);
        }

        ((List) list).add(message);
        session.setAttribute(key, list);
    }

    protected void add(Model model, String key, String message) {
        Object list = new ArrayList();
        if (model.containsAttribute(key)) {
            list = (List) model.asMap().get(key);
        }

        ((List) list).add(message);
        if (model instanceof RedirectAttributes) {
            logger.warn("RedirectAttributes的Flash已经失效，请用传递Session版本的saveError、saveSuccess");
            ((RedirectAttributes) model).addFlashAttribute(key, list);
        } else {
            model.addAttribute(key, list);
        }

    }

    protected void doInitBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
    }

    public abstract String getPortalPrefix();

    protected String redirect(String path) {
        String portalName = this.getPortalPrefix();
        return portalName.startsWith("/") ? "redirect:" + portalName + path : "redirect:/" + portalName + path;
    }

    protected String forward(String path) {
        String portalName = this.getPortalPrefix();
        return portalName.startsWith("/") ? "forward:" + portalName + path : "forward:/" + portalName + path;
    }

    protected PageRequest buildPageRequest(HttpServletRequest request) {
        long offset = NumberUtils.toLong(request.getParameter("offset"), 0L);
        int limit = NumberUtils.toInt(request.getParameter("limit"), 10);
        String requestSort = request.getParameter("sort");
        if (requestSort != null && !requestSort.equals("")) {
            Direction direction = Direction.ASC;
            String order = request.getParameter("order");
            if (order.equals("desc")) {
                direction = Direction.DESC;
            }

            Sort sort = new Sort(direction, new String[]{requestSort});
            return new PageRequest((int) (offset / (long) limit), limit, sort);
        } else {
            return new PageRequest((int) (offset / (long) limit), limit);
        }
    }

    protected boolean isWithXMLHttpRequest(HttpServletRequest request) {
        String xmlRequestHeader = request.getHeader("X-Requested-With");
        return xmlRequestHeader != null && !xmlRequestHeader.equals("") && xmlRequestHeader.contains("XMLHttpRequest");
    }

    public ModelAndView toJson(Object model) {
        MappingJackson2JsonView mappingJackson2JsonView = (MappingJackson2JsonView) this.applicationContext.getBean(MappingJackson2JsonView.class);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setView(mappingJackson2JsonView);
        modelAndView.addObject("_json", model);
        return modelAndView;
    }
}
