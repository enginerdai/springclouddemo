package com.dai.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URI;

@RestController
public class ConsumerController {
    @Autowired
    private LoadBalancerClient loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("order-provider");
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("/discover")
    public Object discover() {

        return loadBalancer.choose("order-provider").getUri().toString();
    }

    @GetMapping("/getPort")
    public String getPort() throws MalformedURLException {
        URI uri =  loadBalancer.choose("order-provider").getUri() ;
        String forObject = new RestTemplate().getForObject(uri.toURL() + "/getPort", String.class);
        return forObject;
    }
}
