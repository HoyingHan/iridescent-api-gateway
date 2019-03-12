package com.iridescent.apigateway.filter;

import com.netflix.zuul.ZuulFilter;





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

        return null;
    }
}
