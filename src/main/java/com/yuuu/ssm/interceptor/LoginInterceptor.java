package com.yuuu.ssm.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.interceptor
 * @Author:Yuuu。
 * @CreateTime:2022-12-25 21:02
 * @Description:
 * @Version:1.0
 */

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if (user != null){
            return true;
        }else {
            request.getRequestDispatcher("/").forward(request,response);
            request.setAttribute("msg","请登录");
            return false;
        }
    }
}
