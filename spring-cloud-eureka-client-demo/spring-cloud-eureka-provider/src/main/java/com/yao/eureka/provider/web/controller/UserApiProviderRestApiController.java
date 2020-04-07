package com.yao.eureka.provider.web.controller;

import com.yao.api.domain.User;
import com.yao.api.service.UserApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * {@link UserApi 用户服务} 提供方 REST API {@link RestController}
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/4/6 12:30
 */
@RestController
@Slf4j
public class UserApiProviderRestApiController {
    @Autowired
    private UserApi userApi;

    /**
     * 保存用户
     * @author <a href="tivenninesongs@163.com">yaoxuguang</a>
     * @date 2020/4/6 12:35
     * @param user 用户实体
     * @return com.yao.api.domain.User
     *          如果保存成功返回{@link User},
     *          如果保存失败返回<code>null</code>
     */
    @PostMapping("/user/save")
    public User saveUser(@RequestBody User user){
        if(userApi.save(user)){
            log.info("UserApi服务方：保存用户成功！{}",user);
            return user;
        }else {
            return null;
        }
    }

    /**
     * 查询所有的用户
     * @author <a href="tivenninesongs@163.com">yaoxuguang</a>
     * @date 2020/4/6 12:37
     * @return java.util.Collection<com.yao.api.domain.User> 用户集合
     */
    @GetMapping("/user/list")
    public Collection<User> list(){
        return userApi.findAll();
    }
}
