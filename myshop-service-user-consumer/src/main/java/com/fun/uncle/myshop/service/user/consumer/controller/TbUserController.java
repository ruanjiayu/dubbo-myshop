package com.fun.uncle.myshop.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fun.uncle.myshop.commons.domain.TbUser;
import com.fun.uncle.myshop.commons.utils.MapperUtils;
import com.fun.uncle.myshop.service.user.api.TbUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/9  11:28
 * @Version: 0.0.1-SNAPSHOT
 */

@Controller
@RequestMapping(value = "user")
public class TbUserController {

    @Reference(version = "${services.versions.user.v1}")
    private TbUserService tbUserService;

    @GetMapping(value = "list")
    public String list(Model model) {
        List<TbUser> tbUsers = tbUserService.selectAll();
        model.addAttribute("tbUsers", tbUsers);
        return "user/list";
    }
}
