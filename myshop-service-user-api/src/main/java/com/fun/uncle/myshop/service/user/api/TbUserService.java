package com.fun.uncle.myshop.service.user.api;

import com.fun.uncle.myshop.commons.domain.TbUser;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/9  10:50
 * @Version: 0.0.1-SNAPSHOT
 */
public interface TbUserService {


    /**
     * 查询所有的用户
     *
     * @return
     */
    List<TbUser> selectAll();

    /**
     * 查询分页数据
     * @param pageNum 页码
     * @param pageSize 笔数
     * @param tbUser 查询参数
     * @return
     */
    PageInfo<TbUser> page(int pageNum, int pageSize, TbUser tbUser);
}
