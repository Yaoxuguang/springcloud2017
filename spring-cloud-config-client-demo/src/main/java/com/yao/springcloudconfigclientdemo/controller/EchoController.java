package com.yao.springcloudconfigclientdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 输出配置项内容
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/4/3 16:53
 */
@RefreshScope
@RestController
public class EchoController {
    @Value("${name}")
    private String name;

    @GetMapping("/getName")
    public String getName(){
        return name;
    }
}
