package com.mycom.springtest.listener;

import com.mycom.springtest.config.MQConfig;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author ：songdalin
 * @date ：2020/9/24 下午 10:28
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
@RabbitListener(MQConfig.class)
public class MessageListener {

    @RabbitHandler
    public void listener(String message){
        System.out.println("接受消息：" + message);
    }
}
