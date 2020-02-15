package com.mycom.springcloudserviceprovider.controller;

import com.mycom.springcloudserviceprovider.entity.VipInfo;
import com.mycom.springcloudserviceprovider.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-15 下午 05:05
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
//@RequestMapping("/getvipbyid")
public class VipInfoController {

    @Autowired
    VipService vipService;

    @GetMapping("/getvipbyid/{id}")
    public VipInfo getVipInfoById(@PathVariable int id){
        VipInfo vipInfo = vipService.queryById(id);
        return vipInfo;
    }
}
