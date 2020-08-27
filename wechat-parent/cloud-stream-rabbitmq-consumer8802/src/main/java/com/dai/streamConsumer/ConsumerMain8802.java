package com.dai.streamConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMain8802 {
    public static void main(String[] args){
        SpringApplication.run(ConsumerMain8802.class, args);
    }
}
