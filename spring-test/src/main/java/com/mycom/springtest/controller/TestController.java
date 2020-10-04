package com.mycom.springtest.controller;

import com.mycom.springtest.sender.MessageSenderUtil;
import com.mycom.springtest.sender.SpringTestSender;
import com.mycom.springtest.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：songdalin
 * @date ：2020/9/24 下午 10:35
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SpringTestSender springTestSender;

    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/send/{message}")
    public void sendMessage(@PathVariable String message){
        springTestSender.sendSpringTestMessage(message);
    }

    @GetMapping("/redis")
    public String redistest(){
        String key = "name";
        String value = "xiaoming";
        redisUtils.add(key, value, 10);
        return String.valueOf(redisUtils.get(key));
    }

}
