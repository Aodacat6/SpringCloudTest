package com.mycom.scclientconsumerhystrix.controller;

import com.mycom.scclientconsumerhystrix.entity.VipInfo;
import com.mycom.scclientconsumerhystrix.feignclient.FeignInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
