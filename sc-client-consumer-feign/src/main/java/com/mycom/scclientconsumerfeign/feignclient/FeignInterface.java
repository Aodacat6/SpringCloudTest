package com.mycom.scclientconsumerfeign.feignclient;

import com.mycom.scclientconsumerfeign.entity.VipInfo;
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

@FeignClient("springcloudclient-provider")
public interface FeignInterface {

    @GetMapping("/getvipbyid/{id}")
    VipInfo getVipById(@PathVariable int id);
}
