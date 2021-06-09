package com.example.ribbonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiService {

    @Autowired
    RestTemplate restTemplate;

//    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hytrixTest(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }


    public String helloFallback(){
        return "服务已关闭";
    }
}
