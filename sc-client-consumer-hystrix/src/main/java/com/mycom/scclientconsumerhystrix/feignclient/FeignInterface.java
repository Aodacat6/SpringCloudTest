package com.mycom.scclientconsumerhystrix.feignclient;

import com.mycom.scclientconsumerhystrix.FallBack.MyFallBack;
import com.mycom.scclientconsumerhystrix.entity.VipInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-16 上午 10:17
 * @description： 这个调用者服务采用的是 feign方式
 *                 feign使用 接口 + 注解的方式动态选择和调用方法，实现负载均衡
 * @modified By：
 * @version: $
 */
//feign中兼容了hystrix，在@feignclient的属性中增加fallback属性配置fallback即可
@FeignClient(value = "springcloudclient-provider", fallback = MyFallBack.class)
public interface FeignInterface {

    @GetMapping("/getvipbyid/{id}")
    VipInfo getVipById(@PathVariable int id);
}
