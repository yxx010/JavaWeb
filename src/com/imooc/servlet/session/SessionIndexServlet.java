package com.imooc.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session/index")
public class SessionIndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       HttpSession session=request.getSession();
        String sessionId=session.getId();
        System.out.println(sessionId);
       String name=(String)session.getAttribute("name");
       response.setContentType("text/plain;charset=utf-8");
       response.getWriter().println("当前用户是："+name);
    }
}
