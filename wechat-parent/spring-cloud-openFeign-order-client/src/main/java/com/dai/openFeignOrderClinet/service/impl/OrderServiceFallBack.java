package com.dai.openFeignOrderClinet.service.impl;

import com.dai.openFeignOrderClinet.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;

@Component // 一定要记得注入到spring容器中
public class OrderServiceFallBack implements OrderService {
    @Override
    public String getServerPort() {
        return "端口查询失败";
    }

    @Override
    @HystrixCommand(commandProperties = {
            // 是否启用服务熔断
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            // 请求阈值
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            // 时间窗口
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            // 错误比率
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50")
    })
    public String queryUserById(int userId) {
        return "信息查询失败,异常了";
    }
}
