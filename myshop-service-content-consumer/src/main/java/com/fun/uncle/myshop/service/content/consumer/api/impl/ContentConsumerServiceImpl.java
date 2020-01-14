package com.fun.uncle.myshop.service.content.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fun.uncle.myshop.service.content.api.ContentConsumerService;

/**
 * @Description: 仅仅是为了获取文章服务的消费者的IP
 * @Author: Xian
 * @CreateDate: 2020/1/13  17:03
 * @Version: 0.0.1-SNAPSHOT
 */
@Service(version = "${services.versions.content.v1}")
public class ContentConsumerServiceImpl implements ContentConsumerService {
    @Override
    public void info() {

    }
}
