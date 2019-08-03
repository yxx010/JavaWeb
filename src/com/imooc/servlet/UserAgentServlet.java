package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserAgentServlet")
public class UserAgentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userAgent=request.getHeader("User-Agent");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(userAgent);
        String output="";
        if(userAgent.indexOf("Intel Mac OS X")!=-1){
            output="<h1>这是Mac端首页</h1>";
        }else if(userAgent.indexOf("iPhone")!=-1||userAgent.indexOf("Android")!=-1){
            output="<h1>手机端首页</h1>";
        }
        response.getWriter().println(output);

    }
}
