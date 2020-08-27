package com.dai.stream.service.impl;

import com.dai.stream.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class) // 定义消息的推送管道
public class IMessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send() {
        String serail = UUID.randomUUID().toString();
        System.out.println("serail: " + serail);
        boolean send = output.send(MessageBuilder.withPayload(serail).build());
        return send ? "成功" : "失败";
    }
}
