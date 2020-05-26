package com.imooc.servlet.employee;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( "/create")
public class CreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String no=request.getParameter("empno");
        String name=request.getParameter("ename");
        String department=request.getParameter("department");
        String job=request.getParameter("job");
        String salary=request.getParameter("salary");
        System.out.println(no);
        Employee employee=new Employee(Integer.parseInt(no),name,department,job,Float.parseFloat(salary));
        ServletContext context=request.getServletContext();
        List list=(List)context.getAttribute("employees");
        list.add(employee);
        context.setAttribute("employees",list);
        request.getRequestDispatcher("/employee.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
