package com.example.helloserver.controller;

import com.example.helloserver.service.PeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.bug1024.common.entity.User;

@RestController
public class PeopleController implements PeopleService {


    @Override
    public User changeSex(@RequestBody User user) {
        user.setAge(20);
        return user;
    }
}
