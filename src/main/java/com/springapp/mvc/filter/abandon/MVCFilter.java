package com.springapp.mvc.filter.abandon;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ZHANGJA4 on 8/18/2015.
 */
//@WebFilter(filterName = "MVCFilter", urlPatterns = {"/book.jsp", "/bookingList.jsp"})
public class MVCFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter..");
        if (((HttpServletRequest) req).getRequestURL().toString().contains("login.jsp")) {
            chain.doFilter(req, resp);
        } else if (null == ((HttpServletRequest) req).getSession().getAttribute("currentUser")) {
            ((HttpServletResponse) resp).sendRedirect("/login.jsp");
            return;
        }else {
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
