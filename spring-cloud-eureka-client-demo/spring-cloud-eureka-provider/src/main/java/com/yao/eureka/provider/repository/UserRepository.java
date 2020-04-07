package com.yao.eureka.provider.repository;

import com.yao.api.domain.User;
import com.yao.api.service.UserApi;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * {@link UserApi 用户服务} 储存
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/4/6 12:40
 */
@Repository
public class UserRepository {

    private ConcurrentMap<Long, User> repository = new ConcurrentHashMap<>();

    private static final AtomicLong idGenerator = new AtomicLong(0);

    public Collection<User> findAll() {
        return repository.values();
    }

    public boolean save(User user) {
        Long id = idGenerator.incrementAndGet();
        user.setId(id);
        return repository.putIfAbsent(id, user) == null;
    }
}
