<%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-09-23
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post">
    验证码：<input type="text" name="checkcode"><img src="${pageContext.request.contextPath}/CheckImgServlet"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
