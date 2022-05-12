package com.training.tebee.rest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter({
             "/servlet/*",
             "/api/*"
})
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest arg0Param,
                         ServletResponse arg1Param,
                         FilterChain arg2Param) throws IOException, ServletException {
        System.out.println("--------------- Filter çalıştı");
        arg2Param.doFilter(arg0Param,
                           arg1Param);
    }

}
