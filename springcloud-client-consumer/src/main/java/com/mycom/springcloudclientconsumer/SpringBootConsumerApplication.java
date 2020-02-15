package com.mycom.springcloudclientconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-15 下午 05:32
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
public class SpringBootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
