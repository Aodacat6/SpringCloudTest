package com.mycom.springtest.listener;

import com.mycom.springtest.config.MQConfig;
import com.mycom.springtest.sender.MessageSenderUtil;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author ：songdalin
 * @date ：2020/9/24 下午 10:28
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
//@RabbitListener(queues = "spring-test")
public class SpringTestListener {

    @Autowired
    private MessageSenderUtil senderUtil;

    @Autowired
    private MQConfig mqConfig;

    @RabbitListener(queuesToDeclare = @Queue("spring-test"))
    @RabbitHandler
    public void listener(String message){
        System.out.println("队列spring-test接受消息：" + message);
        senderUtil.send(mqConfig.springTest2Queue(), message);
    }
}
