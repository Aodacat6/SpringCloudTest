package com.mycom.springtest.config;

import com.rabbitmq.client.AMQP;
//import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：songdalin
 * @date ：2020/9/24 下午 10:52
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
public class MQConfig {

    @Bean("springTestQueue")
    public Queue springTestQueue(){
        return new Queue("spring-test", true);
    }

    @Bean("springTest2Queue")
    public Queue springTest2Queue(){
        return new Queue("spring-test2", true);
    }
}
