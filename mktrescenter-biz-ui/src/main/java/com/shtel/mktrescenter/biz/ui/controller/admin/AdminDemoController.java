package com.shtel.mktrescenter.biz.ui.controller.admin;

import com.shtel.mktrescenter.biz.ui.base.form.SearchForm;
import com.shtel.mktrescenter.biz.ui.base.page.TablePage;
import com.shtel.mktrescenter.biz.ui.message.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author yangyang
 */
@Controller
@RequestMapping(AdminDemoController.PORTAL_PREFIX)
public class AdminDemoController extends AdminController {
    public static final String PORTAL_PREFIX = AdminController.PORTAL_PREFIX + "/demo";
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("index")
    public void index(Model model) {
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public void list(Model model) {
    }

    @RequestMapping(value = "list", method = RequestMethod.POST)
    @ResponseBody
    public JsonObject list(SearchForm searchForm, Model model) {
        return JsonObject.success(new TablePage<>());
    }

    @RequestMapping("form")
    public void form(Model model) {
    }
}
