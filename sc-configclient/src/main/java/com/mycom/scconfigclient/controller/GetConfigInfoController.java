package com.mycom.scconfigclient.controller;

import com.mycom.scconfigclient.entity.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-17 下午 06:03
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping("/api")
public class GetConfigInfoController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/get")
    public Configuration getConfiguration(){
        return configuration;
    }
}
