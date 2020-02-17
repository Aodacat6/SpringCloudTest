package com.mycom.scclientzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-16 下午 09:53
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy    //开启zuul服务
public class SCClientZuulApplication {

    public static void main(String[] args){
        SpringApplication.run(SCClientZuulApplication.class, args);
    }
}
