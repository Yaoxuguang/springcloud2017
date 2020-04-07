package com.yao.eureka.provider;

import com.yao.api.service.UserApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *  {@link UserApi 用户服务} 提供端引导类
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/4/6 12:23
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientProviderBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProviderBootstrap.class,args);
    }
}
