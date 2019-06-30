package com.itlanma.controller;

import com.itlanma.domain.User;
import com.itlanma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author 张生祥
 * @date 2019/06/27 17:17
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/loginStu")
    public String login(HttpSession session, String username, String password){
        User user = userService.findUser(username,password);
        if (user != null){
            //登录成功
            session.setAttribute("user",user);
            return "redirect:../student/list";
        }else {
            //失败
            session.setAttribute("msg","用户名或密码错误");
            return "login";
        }
    }
}
