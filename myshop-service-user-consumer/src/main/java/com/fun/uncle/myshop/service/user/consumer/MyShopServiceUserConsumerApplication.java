package com.fun.uncle.myshop.service.user.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/9  11:24
 * @Version: 0.0.1-SNAPSHOT
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.fun.uncle.myshop")
public class MyShopServiceUserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceUserConsumerApplication.class, args);
    }
}
