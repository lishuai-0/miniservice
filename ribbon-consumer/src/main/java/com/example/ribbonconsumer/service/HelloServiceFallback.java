package com.example.ribbonconsumer.service;

import org.springframework.stereotype.Component;
import top.bug1024.common.entity.User;

@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public User user1(User user) {
        user.setUsername("服务已断开");
        return user;
    }
}
