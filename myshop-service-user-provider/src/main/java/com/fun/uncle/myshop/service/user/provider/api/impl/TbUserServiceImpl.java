package com.fun.uncle.myshop.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fun.uncle.myshop.commons.domain.TbUser;
import com.fun.uncle.myshop.commons.mapper.TbUserMapper;
import com.fun.uncle.myshop.service.user.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/9  11:00
 * @Version: 0.0.1-SNAPSHOT
 */

@Service(version = "${services.versions.user.v1}")
@Transactional(readOnly = true)
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;


    @Override
    public List<TbUser> selectAll() {
        return tbUserMapper.selectAll();
    }
}
