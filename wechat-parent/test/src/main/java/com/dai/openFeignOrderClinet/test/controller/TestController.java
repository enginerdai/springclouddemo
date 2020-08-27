package com.dai.openFeignOrderClinet.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test/")
public class TestController {
    public static final String url = "http://users/users/test";
    @Autowired
    private RestTemplate template;

    @RequestMapping("blanced")
    public Object test(){
        String object = template.getForObject(url, String.class);
        return object;
    }

    @GetMapping("test")
    public String testHtml(){
        return "test";
    }
}
