package com.atguli.gulimall.gulimallmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


//开启feign 远程调用
@EnableFeignClients(basePackages ="com.atguli.gulimall.gulimallmember.feign")
@SpringBootApplication
//加入nacos 注册服务注解
@EnableDiscoveryClient
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
