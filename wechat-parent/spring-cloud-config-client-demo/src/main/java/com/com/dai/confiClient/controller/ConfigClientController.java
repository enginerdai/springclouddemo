package com.com.dai.confiClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RefreshScope 手动版 需要发送post请求，刷新curl -X POST http://xxxx:xxxx/actuator/refresh配置,避免了服务得重启
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String datasource;

    @GetMapping("/test/getConfig")
    public Object getConfig(){
        return datasource;
    }
}
