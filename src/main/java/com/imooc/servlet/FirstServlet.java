package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String html="<h1 style='color:red'>hi,"+name+"!</h1><hr/>";
        PrintWriter out=resp.getWriter();
        out.println(html);

        StringBuffer url=req.getRequestURL();
        System.out.println("url-"+url);
        String uri=req.getRequestURI();
        System.out.println("url-"+url);
        String tempUrl = url.delete(url.length() - uri.length(), url.length()).append("/").toString();
        System.out.println("tempUrl-"+tempUrl);
        System.out.println("url-"+url);
        System.out.println("uri-"+uri);

        StringBuffer url2=req.getRequestURL();

        String tempUrl2 = url.substring(0,url2.length() - uri.length());
        System.out.println("tempUrl2-"+tempUrl2);
        System.out.println("url-"+url);



    }
}