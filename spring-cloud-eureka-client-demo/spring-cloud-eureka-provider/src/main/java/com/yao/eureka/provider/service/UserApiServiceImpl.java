package com.yao.eureka.provider.service;

import com.yao.api.domain.User;
import com.yao.api.service.UserApi;
import com.yao.eureka.provider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * {@link UserApi 用户服务} 提供者实现
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/4/6 12:38
 */
@Service
public class UserApiServiceImpl implements UserApi {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Collection<User> findAll() {
        return userRepository.findAll();
    }
}
