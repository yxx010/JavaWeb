package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ComputerServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        int sum=0;
        if(req.getParameter("n")!=null){
            int n=Integer.parseInt(req.getParameter("n"));
            for (;n>0;n--) {
                sum=sum+n;
            }
            out.println("<h1 style='color:red'>sum:"+sum+"</h1>");
        }
        if(req.getParameterValues("add")!=null){
            String [] adds=req.getParameterValues("add");
            for (String add:adds){
                sum=sum+Integer.parseInt(add);
                out.println("<h1>加数为:"+add+"</h1>");
            }
            out.println("<h1 style='color:red'>运算结果为："+sum+"</h1>");

        }
    }
}
