package com.mycom.scclientzuul.zuulfilter;

import com.netflix.client.http.HttpRequest;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-16 下午 10:51
 * @description： zuul过滤器功能实现
 * @modified By：
 * @version: $
 */
@Component
public class MyZuulFilter extends ZuulFilter {

    /**
     * 路由类型：之前、之后等
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 路由顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否路由
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext requestContent = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContent.getRequest();

        Object accessToken = httpServletRequest.getParameter("token");
        if(accessToken == null) {
            requestContent.setSendZuulResponse(false);
            requestContent.setResponseStatusCode(401);
            try {
                requestContent.getResponse().getWriter().write("token is empty");
            }catch (Exception e){

            }
            return null;
        }else if(checkToken(accessToken)){
            return null;
        }else{
            return null;
        }

    }

    private boolean checkToken(Object accessToken) {
        //这里添加token校验代码
        return true;
    }

    }
