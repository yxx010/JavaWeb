<%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-07-28
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>1-100的和</title>
</head>
<body>
<%
    int sum=0;
    for (int i = 0; i <=100 ; i++) {
        sum+=i;
    }
    out.println("sum="+sum);
%>
</body>
</html>
