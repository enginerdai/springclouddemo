package com.dai.openFeignOrderClinet.service;

import com.dai.openFeignOrderClinet.service.impl.OrderServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "ORDER-SERVER", fallback = OrderServiceFallBack.class)
public interface OrderService {

    @RequestMapping("/getServerPort")
    public String getServerPort();

    @GetMapping("/query/{userId}/userInfo")
    public String queryUserById(@PathVariable("userId") int userId);
}
