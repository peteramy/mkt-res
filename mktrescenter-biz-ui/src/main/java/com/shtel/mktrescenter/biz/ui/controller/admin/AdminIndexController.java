package com.shtel.mktrescenter.biz.ui.controller.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(AdminIndexController.PORTAL_PREFIX)
public class AdminIndexController extends AdminController {
    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("index")
    public void index(Model model) {
    }
}
