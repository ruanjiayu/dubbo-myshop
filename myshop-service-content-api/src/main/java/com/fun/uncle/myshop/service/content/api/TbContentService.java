package com.fun.uncle.myshop.service.content.api;

import com.fun.uncle.myshop.commons.domain.TbContent;
import com.github.pagehelper.PageInfo;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/13  14:37
 * @Version: 0.0.1-SNAPSHOT
 */
public interface TbContentService {

    /**
     * 分页查询
     * @param start
     * @param length
     * @param tbContent
     * @return
     */
    PageInfo<TbContent> page(int start, int length, TbContent tbContent);
}
