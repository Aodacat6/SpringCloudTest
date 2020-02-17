package com.mycom.scconfigclient.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-17 下午 06:04
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class Configuration {

    @Value("${name}")
    private String name;
    @Value("${port}")
    private String port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
