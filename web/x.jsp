<%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-08-10
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>判断x的区间</title>
</head>
<body>
${x}
<c:if test="${x>0 && x<=10}">
    <h1>1-10间的整数</h1>
</c:if>
<c:if test="${x>10 && x<=20}">
    <h2>11-20间的整数</h2>
</c:if>
</body>
</html>
