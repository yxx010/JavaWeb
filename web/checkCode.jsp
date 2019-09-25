<%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-09-23
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String msg=(String) session.getAttribute("msg");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/CheckCodeServlet" method="post">
    验证码：<input type="text" name="checkCode">
    <img id=codeImg onclick="changeImg()" src="${pageContext.request.contextPath}/CheckImgServlet"><br/>
    <input type="submit" value="提交">
    <label style="color: red">${msg}</label>
</form>
</body>
<script>
function changeImg() {
    var codeImg=document.getElementById("codeImg");
    codeImg.src="${pageContext.request.contextPath}/CheckImgServlet?time="+new Date().getTime();
}
</script>
</html>
