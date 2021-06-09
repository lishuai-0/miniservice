package com.example.ribbonconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.bug1024.common.entity.User;

@FeignClient(value = "hello-service",fallback = HelloServiceFallback.class)
public interface HelloService {
    @RequestMapping("/user1")
    public User user1(@RequestBody User user);

}
