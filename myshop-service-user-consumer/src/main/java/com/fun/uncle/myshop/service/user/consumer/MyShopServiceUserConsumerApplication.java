package com.fun.uncle.myshop.service.user.consumer;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
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
// 因为使用了pagehelper,里面附带了mybatis-spring-boot-starter,而我们在消费者这层不需要对数据库进行相关的配置，所以将其排除
@SpringBootApplication(scanBasePackages = "com.fun.uncle.myshop", exclude = DataSourceAutoConfiguration.class)
public class MyShopServiceUserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceUserConsumerApplication.class, args);
        Main.main(args);
    }
}
