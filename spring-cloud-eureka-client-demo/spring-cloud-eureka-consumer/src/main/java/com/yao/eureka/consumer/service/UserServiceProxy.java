package com.yao.eureka.consumer.service;

import com.yao.api.domain.User;
import com.yao.api.service.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * {@link UserApi 用户服务} Proxy实现
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/4/6 15:29
 */
@Service
public class UserServiceProxy implements UserApi {

    /**
     * 通过 REST API 代理到服务端的提供者
     */
    @Autowired
    private RestTemplate restTemplate;

    private static final String PROVIDER_SERVER_URL_PREFIX = "http://user-api-provider";

    @Override
    public boolean save(User user) {
        User returnValue = restTemplate.postForObject(PROVIDER_SERVER_URL_PREFIX + "/user/save",
                user, User.class);
        return returnValue != null;
    }

    @Override
    public Collection<User> findAll() {
        return restTemplate.getForObject(PROVIDER_SERVER_URL_PREFIX + "/user/list",
                Collection.class);
    }
}
