package com.example.helloserver.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.bug1024.common.entity.User;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        return "hello"+request.getServerPort();
    }



    @ResponseBody()
    @RequestMapping("/user")
    public User user(HttpServletRequest request){
        return new User("李帅",18);
    }

    @ResponseBody()
    @RequestMapping("/user1")
    public User user1(@RequestBody User user){
        user.setUsername("服务正常");
        return user;
    }

}
