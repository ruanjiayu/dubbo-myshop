package com.fun.uncle.myshop.service.user.api;

import com.fun.uncle.myshop.commons.domain.TbUser;

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
}
