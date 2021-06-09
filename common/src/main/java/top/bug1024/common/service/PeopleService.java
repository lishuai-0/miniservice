package top.bug1024.common.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.bug1024.common.entity.User;

public interface PeopleService {
    @RequestMapping("thailand/changSex")
    public User changeSex(@RequestBody User user);


}
