package com.dai.openFeignOrderClinet.users.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Value("${server.port}")
    private String port;

    @GetMapping("test")
    public Object test(){
        return "当前访问端口: " + port;
    }

    @GetMapping("/getUser")
    public void getUser(HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.write("123");
        writer.flush();
        writer.close();
    }
}
