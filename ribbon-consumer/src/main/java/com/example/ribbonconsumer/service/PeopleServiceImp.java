package com.example.ribbonconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import top.bug1024.common.service.PeopleService;

//@FeignClient("hello-service")
public interface PeopleServiceImp extends PeopleService {

}
