package com.imooc.servlet.employee;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/emplist")
public class ListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context=request.getServletContext();
        if(context.getAttribute("employees")==null){
            List list=new ArrayList();
            Employee emp=new Employee(7731,"张三","市场部","客户推广",1500f);
            Employee emp1=new Employee(7732,"李四","技术","运维",8500f);
            list.add(emp);
            list.add(emp1);
            context.setAttribute("employees",list);
        }
        request.getRequestDispatcher("/employee.jsp").forward(request,response);

    }
}
