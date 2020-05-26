package freemarker;

import com.imooc.servlet.employee.Employee;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/EmployeeFreeMarkerListServlet")
public class EmployeeListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List list=new ArrayList();
            Employee emp1=new Employee(1001,"张三","市场部","客户推广",1500f);
            Employee emp2=new Employee(1002,"李四","技术","运维",8500f);
            list.add(emp1);
            list.add(emp2);
            request.setAttribute("employee_list",list);
        request.getRequestDispatcher("/employee.ftl").forward(request,response);

    }
}
