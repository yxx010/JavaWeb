package com.imooc.servlet.jstl;

import com.sun.tools.classfile.Opcode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet("/jstl")
public class JstlServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("score","97");
        request.setAttribute("grade","B");
        List list=new ArrayList();
        list.add(new Company("百度","www.baidu.com"));
        list.add(new Company("腾讯","www.tencent.com"));
        list.add(new Company("淘宝","www.taobao.com"));
        request.setAttribute("companies",list);

        Set set=new HashSet();
        set.add("May");
        set.add("March");
        set.add("January");
        set.add("February");
        set.add("April");
        request.setAttribute("months",set);
        request.getRequestDispatcher("/core.jsp").forward(request,response);
    }
}
