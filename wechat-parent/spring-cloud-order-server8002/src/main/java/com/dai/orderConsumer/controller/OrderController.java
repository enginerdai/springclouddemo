package com.dai.orderConsumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {

    @Value("${server.port}")
    private String port;


    @RequestMapping("/getServerPort")
    public String getServerPort(){
        log.info("当前线程:{},端口号:{}", Thread.currentThread().getName(), port);
        return "当前线程: " + Thread.currentThread().getName() + "端口号: " + port;
    }
}
