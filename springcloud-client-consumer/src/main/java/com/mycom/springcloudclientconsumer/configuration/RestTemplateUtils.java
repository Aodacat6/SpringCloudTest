package com.mycom.springcloudclientconsumer.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-16 上午 09:45
 * @description： REST + Ribbon 的服务调用方式
 * @modified By：
 * @version: $
 */
@Configuration
public class RestTemplateUtils {

    @Bean
    @LoadBalanced  //ribbon的负载均衡配置
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
