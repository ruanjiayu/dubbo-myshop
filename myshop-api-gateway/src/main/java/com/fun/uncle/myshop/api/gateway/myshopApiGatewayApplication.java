package com.fun.uncle.myshop.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/13  16:15
 * @Version: 0.0.1-SNAPSHOT
 */
@EnableHystrix
@EnableHystrixDashboard
// 因为使用了pagehelper,里面附带了mybatis-spring-boot-starter,而我们在消费者这层不需要对数据库进行相关的配置，所以将其排除
@SpringBootApplication(scanBasePackages = "com.fun.uncle.myshop", exclude = DataSourceAutoConfiguration.class)
public class myshopApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(myshopApiGatewayApplication.class, args);
    }
}
