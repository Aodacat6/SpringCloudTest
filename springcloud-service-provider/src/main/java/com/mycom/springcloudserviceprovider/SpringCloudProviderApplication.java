package com.mycom.springcloudserviceprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-15 下午 04:44
 * @description：
 * @modified By：
 * @version: $
 */

@SpringBootApplication
@EnableEurekaClient
@MapperScan({"com.mycom.springcloudserviceprovider.mapper"})
public class SpringCloudProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringCloudProviderApplication.class, args);
    }
}
