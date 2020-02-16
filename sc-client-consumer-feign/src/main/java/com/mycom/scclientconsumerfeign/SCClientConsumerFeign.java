package com.mycom.scclientconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-16 上午 10:10
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients   //feign-client启动
public class SCClientConsumerFeign {

    public static void main(String[] args){
        SpringApplication.run(SCClientConsumerFeign.class, args);
    }
}
