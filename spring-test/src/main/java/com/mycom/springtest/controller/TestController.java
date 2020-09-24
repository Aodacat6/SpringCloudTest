package com.mycom.springtest.controller;

import com.mycom.springtest.listener.MessageListener;
import com.mycom.springtest.sender.MessageSender;
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
    private MessageSender messageSender;


    @GetMapping("/send/{message}")
    public void sendMessage(@PathVariable String message){
        messageSender.send(message);
    }
}
