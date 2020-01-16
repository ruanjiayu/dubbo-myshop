package com.fun.uncle.myshop.service.search.api;

import com.fun.uncle.myshop.service.search.domain.TbItemResult;

import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/16  9:24
 * @Version: 0.0.1-SNAPSHOT
 */
public interface SearchService {

    /**
     * 全文检索
     * @param query 查询的内容
     * @param page  第几页开始
     * @param rows 查询几行
     * @return
     */
    List<TbItemResult> search(String query, int page, int rows);
}
