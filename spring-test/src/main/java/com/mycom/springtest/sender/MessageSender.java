package com.mycom.springtest.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2020/9/24 下午 10:27
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class MessageSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String message){
        amqpTemplate.convertAndSend("spring-test", message);
        System.out.println("发送消息：" + message);
    }
}
