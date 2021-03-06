package com.imooc.servlet.el;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/el")
public class CourceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String level=request.getParameter("level");
        Course course=new Course(1,"英语","学历教育");
        HttpSession session=request.getSession();
        session.setAttribute("course",course);
        request.getRequestDispatcher("/el_demo.jsp").forward(request,response);
    }
}
