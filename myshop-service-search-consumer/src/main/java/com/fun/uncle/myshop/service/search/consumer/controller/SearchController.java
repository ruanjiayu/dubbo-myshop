package com.fun.uncle.myshop.service.search.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fun.uncle.myshop.service.search.api.SearchService;
import com.fun.uncle.myshop.service.search.domain.TbItemResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/16  10:55
 * @Version: 0.0.1-SNAPSHOT
 */
@RestController
public class SearchController {

    @Reference(version = "${services.versions.search.v1}")
    private SearchService searchService;

    @RequestMapping(value = "search/{query}/{page}/{rows}", method = RequestMethod.GET)
    public List<TbItemResult> search(
            @PathVariable String query,
            @PathVariable int page,
            @PathVariable int rows
    ) {
        return searchService.search(query, page, rows);
    }
}
