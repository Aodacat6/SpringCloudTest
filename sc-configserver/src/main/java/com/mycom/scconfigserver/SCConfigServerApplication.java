package com.mycom.scconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-17 下午 04:55
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableConfigServer   //开启配置server
public class SCConfigServerApplication {

    public static void main(String[] args){
        SpringApplication.run(SCConfigServerApplication.class, args);
    }
}
