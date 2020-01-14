package com.fun.uncle.myshop.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fun.uncle.myshop.commons.domain.TbUser;
import com.fun.uncle.myshop.commons.mapper.TbUserMapper;
import com.fun.uncle.myshop.service.user.api.TbUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

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

    @Override
    public PageInfo<TbUser> page(int pageNum, int pageSize, TbUser tbUser) {
        String username = tbUser.getUsername();
        String phone = tbUser.getPhone();
        String email = tbUser.getEmail();

        Example example = new Example(TbUser.class);
        example.createCriteria()
                .andLike("username", username != null ? username + "%" : null)
                .andLike("phone", phone != null ? phone + "%" : null)
                .andLike("email", email != null ? email + "%" : null);
        PageHelper.offsetPage(pageNum, pageSize);
        PageInfo<TbUser> pageInfo = new PageInfo<>(tbUserMapper.selectByExample(example));
        return pageInfo;
    }
}
