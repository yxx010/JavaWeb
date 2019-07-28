<%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-07-28
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>求y的值</title>
</head>
<body>
<%
    int x=-5;
    int y=0;
    String s=null;
    if(x<0){
        y=-1;
        s="当x<0时，输出";
    }else if(x==0){
        y=0;
        s="当x=0时，输出";
    }else if(x>0){
        s="当x>0时，输出";
        y=1;
    }
%>
<div align="center">
    <div><%=s%></div>
    <div>x=<%=x%></div>
    <div>y=<%=y%></div>
</div>
</body>
</html>
