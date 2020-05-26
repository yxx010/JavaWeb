package com.imooc.servlet.ajax;

import com.alibaba.fastjson.JSON;
import com.imooc.servlet.employee.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/EmployeeList")
public class EmployeeListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List list=new ArrayList();
        String type=request.getParameter("t");
        if(type!=null&&type.equals("pypl")){
            list.add(new Employee(1,"pypl-Marry","市场部","职员",10000F));
            list.add(new Employee(2,"pypl-王二","市场部","经理",20000F));
            list.add(new Employee(3,"pypl-张三","人事部","经理",20000F));
            list.add(new Employee(4,"pypl-李四","市场部","主管",10000F));

        }else{
            list.add(new Employee(1,"Marry","市场部","职员",10000F));
            list.add(new Employee(2,"王二","市场部","经理",20000F));
            list.add(new Employee(3,"张三","人事部","经理",20000F));
            list.add(new Employee(4,"李四","市场部","主管",10000F));
        }
        String json= JSON.toJSONString(list);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(json);

    }
}
