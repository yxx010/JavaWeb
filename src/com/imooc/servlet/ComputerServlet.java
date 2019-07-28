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
        Integer n=Integer.parseInt(req.getParameter("n"));
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum=sum+i;
        }
        PrintWriter out=resp.getWriter();
        out.println("<h1 style='color:red'>"+sum+"</h1>");

    }
}
