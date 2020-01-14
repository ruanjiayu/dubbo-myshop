package com.fun.uncle.myshop.service.user.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fun.uncle.myshop.service.user.api.UserConsumerService;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/13  16:59
 * @Version: 0.0.1-SNAPSHOT
 */
@Service(version = "${services.versions.user.v1}")
public class UserConsumerServiceImpl implements UserConsumerService {
    @Override
    public void info() {

    }
}
