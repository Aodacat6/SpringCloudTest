package com.mycom.springtest.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
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
public class MessageSenderUtil {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(Queue queue, String message){
        amqpTemplate.convertAndSend(queue.getName(), message);
        System.out.println("向队列："+queue.getName()+",发送消息：" + message);
    }
}
