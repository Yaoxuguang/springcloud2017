package com.yao.api.service;

import com.yao.api.domain.User;

import java.util.Collection;

/**
 * 用户服务对外开放接口
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/4/6 00:11
 */
public interface UserApi {
    /**
     * 保存用户信息
     * @author <a href="tivenninesongs@163.com">yaoxuguang</a>
     * @date 2020/4/6 0:12
     * @param user 用户对象
     * @return boolean 如果保存成功的话，返回<code>true</code>
     *                  否则返回<code>false</code>
     */
    boolean save(User user);

    /**
     * 查询所有用户
     * @author <a href="tivenninesongs@163.com">yaoxuguang</a>
     * @date 2020/4/6 0:14
     * @return java.util.Collection<com.yao.api.domain.User>
     *          不会返回<code>null</code>
     */
    Collection<User> findAll();
}
