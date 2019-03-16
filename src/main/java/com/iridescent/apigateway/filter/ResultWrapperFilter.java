package com.iridescent.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.netflix.ribbon.RibbonHttpResponse;
import sun.misc.IOUtils;


import java.io.IOException;
import java.io.InputStream;


/**
 * Description:
 *
 * @author 陌北有棵树
 * @version 2019/3/13
 */
public class ResultWrapperFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        // 方法一
        try {
            Object zuulResponse = RequestContext.getCurrentContext().get("zuulResponse");
            if (zuulResponse != null) {
                RibbonHttpResponse resp = (RibbonHttpResponse) zuulResponse;
                String body = resp.getBody().toString();
                System.err.println(body);
                resp.close();
                RequestContext.getCurrentContext().setResponseBody(body);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 方法二
        InputStream stream = RequestContext.getCurrentContext().getResponseDataStream();

            String body = stream.toString();
            System.err.println(body);
            RequestContext.getCurrentContext().setResponseBody(body);

        return null;
    }



}
