<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-07-28
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<%
    List<String> list=new ArrayList<>();
    list.add("JSP基础入门");
    list.add("Serlet详解");
    list.add("EL表达式初识");
    list.add("JSTL标签库初识");
%>
<%
    for (int i=0;i<list.size();i++){
%>       <span>第<%=i+1%>条：<%=list.get(i)%></span><br>
<%   }
%>
<span></span>
</body>
</html>
