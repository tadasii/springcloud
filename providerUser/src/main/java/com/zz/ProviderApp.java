package com.zz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zhangzheng on 2019/3/27.
 */
@SpringBootApplication
@EnableEurekaClient //eureka 客户端
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class);
    }
}
