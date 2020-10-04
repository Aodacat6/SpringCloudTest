package com.mycom.springtest.listener;

import com.mycom.springtest.config.MQConfig;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2020/9/26 上午 11:28
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
@RabbitListener(queuesToDeclare = @Queue("spring-test2"))
public class SpringTest2Listener {

    @RabbitHandler
    public void listener2(String message){
        System.out.println("队列spring-test2接受消息：" + message);

    }
}
