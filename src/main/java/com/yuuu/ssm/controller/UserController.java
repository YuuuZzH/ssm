package com.yuuu.ssm.controller;

import com.yuuu.ssm.pojo.User;
import com.yuuu.ssm.service.UserService;
import com.yuuu.ssm.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.controller
 * @Author:Yuuu。
 * @CreateTime:2022-12-14 16:16
 * @Description:
 * @Version:1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/quit")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "index";
    }


    @RequestMapping(value = {"/user"}, method = RequestMethod.GET)
    public String loginUser(String username, String password,HttpServletRequest request,Model model) {
        User user1 = userService.userLogin(username, password);
        HttpSession session = request.getSession();
        if (user1 != null) {
            session.setAttribute("user",user1);
            return "redirect:/page/first";
        } else {
            model.addAttribute("msg","账号或密码输入错误！");
            return "index";
        }
    }

    @RequestMapping(value = "/page/first",method = RequestMethod.GET)
    public String manage_page(Model model,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "manage_page";

    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String registerUser(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String password = user.getPassword();
        password = MD5Util.str2MD5(password);
        user.setPassword(password);
//        System.out.println(user);
        boolean b = userService.addUser(user);
        if (b) {
            return "index";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/check",method = RequestMethod.GET)
    public void checkUsername(@RequestParam("username") String username,HttpServletResponse response) throws IOException {
        User existUser = userService.isExistUser(username);
        if (existUser != null){
            response.getWriter().write("no");
        }else {
            response.getWriter().write("ok");
        }
    }

}
