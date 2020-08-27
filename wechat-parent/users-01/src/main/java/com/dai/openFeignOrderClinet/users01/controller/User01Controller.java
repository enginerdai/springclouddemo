package com.dai.openFeignOrderClinet.users01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/")
public class User01Controller {

    @Value("${server.port}")
    private String port;

    @GetMapping("test")
    public Object test(){

        return "当前访问端口: " + port;
    }
}
