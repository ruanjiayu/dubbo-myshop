package com.fun.uncle.myshop.web.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/13  16:46
 * @Version: 0.0.1-SNAPSHOT
 */
@Controller
public class MainController {

    /**
     * 跳转到首页
     *
     * @return
     */
    @RequestMapping(value = {"", "main"}, method = RequestMethod.GET)
    public String main() {
        return "main";
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
