package com.demo.search.service.impl;

import com.demo.search.mapper.UserMapper;
import com.demo.search.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 11:12
 * 4
 */
@Service
@CacheConfig(cacheNames = "c1")
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
    @Cacheable(key = "#id")
    public User getUserByid(int id){
        return userMapper.getUserByid(id);
    }
}
