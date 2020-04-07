package com.yao.eureka.consumer;

import com.yao.api.service.UserApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * {@link UserApi 用户服务} 消费端引导类
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/4/6 15:25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UserApiConsumerRestApiController {
    public static void main(String[] args) {
        SpringApplication.run(UserApiConsumerRestApiController.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
