package com.yao.api.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户对象
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/4/6 00:06
 */
@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private Integer age;
}
