package com.imooc.servlet.direct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/direct/check")
public class CheckLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("用户登录成功");
        //请求设置自定义属性username
        request.setAttribute("username","admin");
        request.setAttribute("password","123456");
        //方法一：请求转发
        request.getRequestDispatcher("/direct/index").forward(request,response);
        //方法二：响应重定向
        //response.sendRedirect("/direct/index");
    }
}
