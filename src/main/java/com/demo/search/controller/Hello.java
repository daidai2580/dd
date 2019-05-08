package com.demo.search.controller;

import com.demo.search.pojo.User;
import com.demo.search.service.impl.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 10:54
 * 4
 */
@RestController
@Api(value = "hello")
public class Hello {
    @Autowired
    UserService userService;


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/listuser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserByid(id);
    }

}
