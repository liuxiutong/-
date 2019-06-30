package com.itlanma.interceptor;

import com.itlanma.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 张生祥
 * @date 2019/06/27 14:37
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        //判断用户是否登录
        User user = (User) request.getSession().getAttribute("user");
        if (user == null){
            //没有登录
            response.sendRedirect(request.getContextPath() + "/pages/denied.jsp");
            return false;
        }
        return true;
    }
}
