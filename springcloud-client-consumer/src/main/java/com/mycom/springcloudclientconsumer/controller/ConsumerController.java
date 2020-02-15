package com.mycom.springcloudclientconsumer.controller;

import com.mycom.springcloudclientconsumer.entity.VipInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-15 下午 05:37
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping("/getvipbyid")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public VipInfo getVipById(@PathVariable int id){

        return restTemplate.getForObject
                //不用eureka时写死地址
                //("http://localhost:8081/getvipbyid/" + Integer.toString(id), VipInfo.class);
                  //使用eureka，多个服务，根据服务名灵活选择
                  ("http://springcloudclient-provider/getvipbyid/" + Integer.toString(id), VipInfo.class);
    }


}
