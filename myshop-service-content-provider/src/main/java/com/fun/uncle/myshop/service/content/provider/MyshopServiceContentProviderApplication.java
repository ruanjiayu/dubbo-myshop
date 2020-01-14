package com.fun.uncle.myshop.service.content.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/13  14:40
 * @Version: 0.0.1-SNAPSHOT
 */

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.fun.uncle.myshop")
@EnableTransactionManagement
@MapperScan(basePackages = "com.fun.uncle.myshop.commons.mapper")
public class MyshopServiceContentProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyshopServiceContentProviderApplication.class, args);
        Main.main(args);
    }
}
