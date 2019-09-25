package checkcode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CheckCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code1=(String) request.getSession().getAttribute("checkCode");
        System.out.println(code1);
        String code2=request.getParameter("checkCode");
        System.out.println(code2);

        if(code2==null||!code2.equalsIgnoreCase(code1)){
            request.setAttribute("msg","验证码输入错误");
            request.getRequestDispatcher("/checkCode.jsp").forward(request,response);
            return;
        }
        response.getWriter().println("Success");
    }
}
