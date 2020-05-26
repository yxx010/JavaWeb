package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String mobile=req.getParameter("mobile");
        String sex=req.getParameter("sex");
        String []specs=req.getParameterValues("spec");
        PrintWriter out=resp.getWriter();
        out.println("<a href='http://wwww.baidu.com'>Baidu</a>");
        out.println("<h1 style='color:red'>name:"+name+"<h1>");
        out.println("<h1 style='color:red'>mobile:"+mobile+"<h1>");
        out.println("<h1 style='color:red'>sex:"+sex+"<h1>");
        for(String spec:specs){
            out.println("<h1 style='color:red'>sepc:"+spec+"</h1>");
        }

    }
}


