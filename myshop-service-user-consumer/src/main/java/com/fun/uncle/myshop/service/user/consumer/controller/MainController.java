package com.fun.uncle.myshop.service.user.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/14  9:35
 * @Version: 0.0.1-SNAPSHOT
 */
@Controller
public class MainController {

    /**
     * 跳转到首页
     *
     * @return
     */
    @RequestMapping(value = {"main", ""}, method = RequestMethod.GET)
    public String main() {
        return "user/main";
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "user/index";
    }
}
