package com.fun.uncle.myshop.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/13  16:45
 * @Version: 0.0.1-SNAPSHOT
 */

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.fun.uncle.myshop", exclude = DataSourceAutoConfiguration.class)
public class MyShopWebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShopWebAdminApplication.class, args);
    }
}
