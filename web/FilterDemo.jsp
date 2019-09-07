<%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-09-03
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String flag=request.getParameter("flag");
%>
<html>
<head>
    <title>系统登录</title>
    <script type="application/javascript">
        var flag='<%=flag%>';
        if("1"==flag){
            alert("请登录系统！");
        }
    </script>
</head>
<body>
<form action="login.jsp" method="post" class="smart-green">
    <h1>系统登录</h1>
    <label>
        <span>用户名：</span>
        <input id="username" type="text" name="username">
    </label>
    <label>
        <span>密码：</span>
        <input id="password" type="text" name="password">
    </label>
    <label>
        <input type="submit" value="登录">
    </label>
</form>
</body>
</html>
