package com.imooc.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session/login")
public class SessionLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("用户登录成功！");
        HttpSession session=request.getSession();
        String sessionId=session.getId();
        System.out.println(sessionId);
        session.setAttribute("name","张三");
        request.getRequestDispatcher("/session/index").forward(request,response);
    }
}
