package com.mycom.scclientconsumerhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-16 上午 10:59
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix     //开启熔断器
public class SCClientConsumerHystrixApplication {

    public static void main(String[] args){
        SpringApplication.run(SCClientConsumerHystrixApplication.class, args);
    }
}
