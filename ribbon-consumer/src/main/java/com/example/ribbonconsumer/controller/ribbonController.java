package com.example.ribbonconsumer.controller;

import com.example.ribbonconsumer.service.HelloService;
import com.example.ribbonconsumer.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;
import top.bug1024.common.entity.User;

@RestController
public class ribbonController {


    @Autowired
    RestTemplate restTemplate;


    @RequestMapping(value = "/user")
    public User user(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/user", User.class).getBody();
    }


    @Autowired
    HiService hiService;


    @RequestMapping("/hello")
    public String hello(){
        return hiService.hytrixTest();
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.POST)
    public User hello2(@RequestBody User user){
        return user;
    }

    //声明式服务调用
    @Autowired
    HelloService helloService;



    @RequestMapping("/hello1")
    public User hello1(){
        User user = helloService.user1(new User("lishuai", 18));
        return user;
    }


//    @Autowired
//    PeopleServiceImp peopleServiceImp;
//
//    @RequestMapping("/getUserInfo")
//    public User getUserInfo(){
//        User lishuai = new User("lishuai", 18);
//        User user = peopleServiceImp.changeSex(lishuai);
//        return user;
//    }


}
