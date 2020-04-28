package com.atguli.gulimall.gulimallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.atguli.gulimall.gulimallproduct.dao")
@SpringBootApplication
//加入nacos 注册服务注解
@EnableDiscoveryClient
//开启feign 远程调用
@EnableFeignClients(basePackages ="com.atguli.gulimall.gulimallproduct.feign")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
