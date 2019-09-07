
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String username=request.getParameter("username");
    String password=request.getParameter("password");
    session.setAttribute("loginUser",username);
    //重定向
    response.sendRedirect(request.getContextPath()+"/message.jsp");

%>
