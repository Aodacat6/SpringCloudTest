package com.mycom.springtest.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @author ：songdalin
 * @date ：2020/9/27 下午 01:01
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void add(String key, Object object, long expireTime){
        redisTemplate.opsForValue().set(key, object, expireTime, TimeUnit.MINUTES);
    }

    public Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public boolean isExistKey(String key){
        return redisTemplate.hasKey(key);
    }

    public boolean deleteKey(String key){
        if (isExistKey(key)){
            return redisTemplate.delete(key);
        }
        return true;
    }

    public boolean expire(String key, long expireTime){
        if (isExistKey(key)){
            return redisTemplate.expire(key, expireTime, TimeUnit.MINUTES);
        }
        return false;
    }
}
