package com.imooc.servlet.direct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Integer.parseInt;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int n=parseInt(request.getParameter("n"));
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        request.setAttribute("sum",sum);
        request.getRequestDispatcher("/ShowAddServlet").forward(request,response);
    }
}
