package com.Lab2;

import javax.servlet.*;
import java.io.IOException;

public class WangKexinFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("WangKexinFilter-->before chain");
        chain.doFilter(req, resp);
        System.out.println("WangKexinFilter-->after chain");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
