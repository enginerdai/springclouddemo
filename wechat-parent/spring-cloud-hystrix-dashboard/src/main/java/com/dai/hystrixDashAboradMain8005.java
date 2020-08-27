package com.dai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class hystrixDashAboradMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(hystrixDashAboradMain8005.class, args);
    }
}
