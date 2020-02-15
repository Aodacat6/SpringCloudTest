package com.mycom.springcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-15 下午 07:51
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }
}
