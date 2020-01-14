package com.fun.uncle.myshop.service.content.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fun.uncle.myshop.commons.domain.TbContent;
import com.fun.uncle.myshop.commons.mapper.TbContentMapper;
import com.fun.uncle.myshop.service.content.api.TbContentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/13  14:42
 * @Version: 0.0.1-SNAPSHOT
 */
@Service(version = "${services.versions.content.v1}")
public class TbContentServiceImpl implements TbContentService {

    @Autowired
    private TbContentMapper tbContentMapper;

    @Override
    public PageInfo<TbContent> page(int start, int length, TbContent tbContent) {
        PageHelper.offsetPage(start, length);
        PageInfo<TbContent> pageInfo = new PageInfo<>(tbContentMapper.select(tbContent));
        return pageInfo;
    }
}
