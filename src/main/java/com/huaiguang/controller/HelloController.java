package com.huaiguang.controller;

import com.huaiguang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello,SpringBoot!";
    }
    @RequestMapping("/json")
    public List<User> jsonTest(){
        User user = new User();
        user.setName("杨幂");
        user.setAge(19);
        user.setSex("女");
        List<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }
}
