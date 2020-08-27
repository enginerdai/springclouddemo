package com.dai.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMain9888 {
    public static void main(String[] args){
        SpringApplication.run(ConsumerMain9888.class, args);
    }
}
