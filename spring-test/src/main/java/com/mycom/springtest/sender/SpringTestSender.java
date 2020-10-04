package com.mycom.springtest.sender;

import com.mycom.springtest.config.MQConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2020/9/26 上午 11:25
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class SpringTestSender {

    @Autowired
    private MessageSenderUtil messageSenderUtil;

    @Autowired
    private MQConfig mqConfig;

    public void sendSpringTestMessage(String message){
        messageSenderUtil.send(mqConfig.springTestQueue(), message);
    }
}
