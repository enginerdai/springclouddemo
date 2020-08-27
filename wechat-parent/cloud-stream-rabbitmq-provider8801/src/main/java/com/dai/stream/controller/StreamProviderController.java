package com.dai.stream.controller;

import com.dai.stream.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StreamProviderController {

    @Resource
    private IMessageProvider provider;

    @GetMapping("/send")
    public String sendMessage(){
        return provider.send();
    }
}
