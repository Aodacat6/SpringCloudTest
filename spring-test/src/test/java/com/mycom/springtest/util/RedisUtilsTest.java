package com.mycom.springtest.util;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

/**
 * @author ：songdalin
 * @date ：2020/9/27 下午 06:02
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
public class RedisUtilsTest {

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void add() {
        redisUtils.add("name", "xiaoming", 10);
        System.out.println(redisUtils.get("name"));
    }
}