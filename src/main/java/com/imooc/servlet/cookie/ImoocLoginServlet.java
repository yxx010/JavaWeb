package com.imooc.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie/login")
public class ImoocLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("用户登录成功!");
        Cookie cookie=new Cookie("user","admin");
        response.addCookie(cookie);
        //设置cookie有效期，默认是当前浏览器有效
        cookie.setMaxAge(60);
        response.getWriter().println("login success!");
    }
}
