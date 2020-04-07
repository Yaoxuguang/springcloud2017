package com.yao.eureka.consumer.web.controller;

import com.yao.api.domain.User;
import com.yao.api.service.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * 用户服务 REST API
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/4/6 15:51
 */
@RestController
public class UserRestApiController {
    @Autowired
    private UserApi userApi;

    /**
     * 根据用户名称保存用户
     * @author <a href="tivenninesongs@163.com">yaoxuguang</a>
     * @date 2020/4/6 15:56
     * @param name 用户名称
     * @return com.yao.api.domain.User
     *  如果保存成功返回<code>user</code>\
     *  未保存成功返回<code>null</code>
     */
    @PostMapping("/user/save")
    public User saveUser(@RequestParam String name){
        User user = new User();
        user.setName(name);
        if(userApi.save(user)){
            return user;
        }else {
            return null;
        }
    }

    /**
     * 查询内存中所有的用户
     * @author <a href="tivenninesongs@163.com">yaoxuguang</a>
     * @date 2020/4/6 16:01
     * @return java.util.Collection<com.yao.api.domain.User>
     */
    @GetMapping("/user/list")
    public Collection<User> findAll(){
        return userApi.findAll();
    }
}
