package com.demo.search.mapper;

import com.demo.search.pojo.User;

import java.util.List;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 11:17
 * 4
 */
public interface UserMapper {
    List<User> getAllUser();

    User getUserByid(int id);
}
