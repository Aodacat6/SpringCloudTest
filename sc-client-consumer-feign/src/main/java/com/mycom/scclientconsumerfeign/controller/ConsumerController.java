package com.mycom.scclientconsumerfeign.controller;

import com.mycom.scclientconsumerfeign.entity.VipInfo;
import com.mycom.scclientconsumerfeign.feignclient.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

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

    @Resource
    private FeignInterface feignInterface;

    @GetMapping("/{id}")
    public VipInfo getVipById(@PathVariable int id){

        return feignInterface.getVipById(id);
    }


}
