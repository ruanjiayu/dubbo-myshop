package com.fun.uncle.myshop.service.redis.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/14  15:26
 * @Version: 0.0.1-SNAPSHOT
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class MyShopServiceRedisProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceRedisProviderApplication.class, args);
        Main.main(args);
    }
}
