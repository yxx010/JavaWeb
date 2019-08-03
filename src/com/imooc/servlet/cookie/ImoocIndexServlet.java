package com.imooc.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie/index")
public class ImoocIndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie []cs=request.getCookies();

        String user=null;
        if(cs == null){
            response.getWriter().println("user not login");
            return;
        }
        for (Cookie c:cs){
            System.out.println(c.getName()+c.getValue());
            if(c.getName().equals("user")){
                user=c.getValue();
                break;

            }
        }
        if(user == null){
            response.getWriter().println("user not login");
        } else{
            response.getWriter().println("user:"+user);
        }
    }
}
