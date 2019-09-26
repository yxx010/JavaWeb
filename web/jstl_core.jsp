<%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-08-10
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--/jstl转发过来的-->
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${score}</h1>
<c:if test="${score>=60}">
    <h1 style="color: green">恭喜，你已通过测试</h1>
</c:if>
<c:if test="${score<60}">
    <h1 style="color: red">对不起，再接再厉</h1>
</c:if>

<!--多分枝判断-->
${grade}
<c:choose>
    <c:when test="${grade=='A'}">
        <h2>优秀</h2>
    </c:when>
    <c:when test="${grade=='B'}">
        <h2>不错哟</h2>
    </c:when>
    <c:when test="${grade=='C'}">
        <h2>水平一般</h2>
    </c:when>
    <c:when test="${grade=='D'}">
        <h2>需要努力</h2>
    </c:when>
    <c:otherwise>
        <h2>随缘吧，不满足条件</h2>
    </c:otherwise>
</c:choose>
<c:forEach items="${requestScope.companies}" var="c" varStatus="idx">
    <h2 style="color: green">${idx.index+1}.${c.cname}-${c.url}</h2>
</c:forEach>

<c:forEach items="${months}" var="m" varStatus="idx">
    <h2 style="color: green">${idx.index+1}——${m}</h2>
</c:forEach>
<%
    request.setAttribute("amt","198989678.346");
    request.setAttribute("now",new java.util.Date());
    request.setAttribute("html","<a href='index.html'>index</a>");
    request.setAttribute("noting",null);
%>
<h2>${now}</h2>
<h2><f:formatDate value="${now}"></f:formatDate></h2>
<h2><f:formatDate value="${now}" pattern="yyyy年MM月dd日HH时mm分ss秒SSS毫秒"></f:formatDate></h2>
<h2>${amt}</h2>
<h2>￥<f:formatNumber value="${amt}" pattern="0,000.00"></f:formatNumber>元</h2>
<h2>null默认值:${noting}</h2>
<h2>null默认值:<c:out value="${noting}" default="无"></c:out></h2>
<h2><c:out value="${html}" escapeXml="true"></c:out></h2>
</body>
</html>
