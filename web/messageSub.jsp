<%@ page import="model.Message" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-09-03
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String title=request.getParameter("title");
    String content=request.getParameter("content");
    Message message=new Message();
    message.setTitle(title);
    message.setContent(content);
    List<Message> messages=(List<Message>) session.getAttribute("messages");
    if(messages==null){
        messages=new ArrayList<Message>();
        session.setAttribute("messages",messages);
    }
    messages.add(message);
    response.sendRedirect(request.getContextPath()+"/message.jsp?subFlag=1");
%>