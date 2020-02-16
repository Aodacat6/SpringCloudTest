package com.mycom.scclientconsumerhystrix.FallBack;

import com.mycom.scclientconsumerhystrix.entity.VipInfo;
import com.mycom.scclientconsumerhystrix.feignclient.FeignInterface;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-16 下午 05:29
 * @description：
 *
 * Hystrix熔断器——实现一个fallback方法，定义失败返回类型，然后配置到feign的注解上即可
 * 注意：熔断机制是在调用方实现的，不是服务提供方。
 *
 *
 * @modified By：
 * @version: $
 */
@Component
public class MyFallBack implements FeignInterface {

    @Override
    public VipInfo getVipById(int id) {
        VipInfo vipInfo = new VipInfo();
        vipInfo.setId(400);
        vipInfo.setName("错误，访问不通");
        vipInfo.setSex("99");

        return vipInfo;
    }
}
