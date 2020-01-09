package com.fun.uncle.myshop.service.user.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description: 用户服务提供者
 * @Author: Xian
 * @CreateDate: 2020/1/9  10:57
 * @Version: 0.0.1-SNAPSHOT
 */

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.fun.uncle.myshop")
@EnableTransactionManagement
@MapperScan(basePackages = "com.fun.uncle.myshop.commons.mapper")
public class MyShopServiceUserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceUserProviderApplication.class, args);
        Main.main(args);
    }
}
