package com.dai.orderConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderServerMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(OrderServerMain8002.class, args);
    }
}
