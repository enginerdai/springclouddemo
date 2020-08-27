package com.dai.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RabbitMQProviderMain8801 {
    public static void main(String[] args){
        SpringApplication.run(RabbitMQProviderMain8801.class, args);
    }
}
