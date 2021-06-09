package top.bug1024.common.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.bug1024.common.entity.User;
import top.bug1024.common.service.PeopleService;

@RestController
public class PeopleController implements PeopleService {


    @Override
    public User changeSex(@RequestBody User user) {
        return user;
    }
}
