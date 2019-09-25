package checkcode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "checkcode.CheckCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code1=(String) request.getSession().getAttribute("checkCode");
        String code2=request.getParameter("checkCode");
        if(code2==null||!code2.equals(code1)){
            request.setAttribute("msg","验证码输入不正确");
            request.getRequestDispatcher("/checkCode.jsp").forward(request,response);
            return;
        }
    }
}
