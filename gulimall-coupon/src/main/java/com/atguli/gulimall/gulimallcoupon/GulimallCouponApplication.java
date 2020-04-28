package com.atguli.gulimall.gulimallcoupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//开启feign 远程调用
@EnableFeignClients(basePackages ="com.atguli.gulimall.gulimallcoupon.feign")
@SpringBootApplication
//加入nacos 注册服务注解
@EnableDiscoveryClient
/**
 * nacos 配置注册中心
 * 1.引入依赖
 * <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *
 * 2.创建bootstrap.properties 文件
 * 3.给配置中心加数据集 gulimall-coupon.properties
 * @RefreashScope
 * 4.
 */
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
