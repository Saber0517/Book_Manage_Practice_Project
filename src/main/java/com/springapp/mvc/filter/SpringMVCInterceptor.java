package com.springapp.mvc.filter;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SpringMVCInterceptor implements HandlerInterceptor {


    /**
     * preHandle???????????????????????Controller?????????SpringMVC??Interceptor??????????????
     * ??Interceptor???SpringMVC????????????????????????Interceptor??preHandle?????
     * Controller?????????SpringMVC???Interceptor??????????????????????preHandle??
     * ???false??preHandle?????false????????????
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle...");
        if (request.getRequestURL().toString().contains("login")) {
            return true;
        } else if (null == request.getSession().getAttribute("currentUser")) {
            response.sendRedirect("/login.jsp");
            return false;
        } else {
            return true;
        }

    }

    /**
     * ???????????Interceptor?preHandle??????true????????postHandle???????????????????????????
     * ??????Controller???????????????DispatcherServlet??????????????????????????ModelAndView???
     * ????????????????????????????????Interceptor???????????????Struts2???????????????
     * ??Struts2???intercept?????????ActionInvocation?invoke???Struts2???ActionInvocation?invoke?????????Interceptor
     * ?????action?????Interceptor????????????invoke?????Interceptor????????????invoke?????
     */
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {


    }

    /**
     * ????????????Interceptor?preHandle???????true???????????????????????DispatcherServlet????????
     * ????????????????????????????????Interceptor?preHandle???????true??????
     */
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub  

    }

}  