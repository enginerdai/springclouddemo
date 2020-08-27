package com.dai.openFeignOrderClinet.controller;

import com.dai.openFeignOrderClinet.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    OrderService orderService;

    @GetMapping("/consumer/getServerPort")
    public String getServerPort(){
        return orderService.getServerPort();
    }

    @GetMapping("/consumer/query/{userId}/userInfo")
    public String queryUserInfoByUserId(@PathVariable("userId") int userId){
        return orderService.queryUserById(userId);
    }
}
