package com.fun.uncle.myshop.service.search.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/16  10:51
 * @Version: 0.0.1-SNAPSHOT
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class MyShopServiceSearchConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceSearchConsumerApplication.class, args);
    }
}
