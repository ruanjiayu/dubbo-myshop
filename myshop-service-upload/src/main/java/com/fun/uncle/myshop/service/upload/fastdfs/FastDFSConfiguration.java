package com.fun.uncle.myshop.service.upload.fastdfs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:  Java 配置方式定义 StorageFactory 的 Bean 使其可以被依赖注入
 * @Author: Xian
 * @CreateDate: 2020/1/14  11:24
 * @Version: 0.0.1-SNAPSHOT
 */
@Configuration
public class FastDFSConfiguration {
    @Bean
    public StorageFactory storageFactory() {
        return new StorageFactory();
    }
}
