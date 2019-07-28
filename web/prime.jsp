<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-07-28
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    //定义方法
   boolean isPrime(int num){
       boolean flag=true;
       for(int j=2;j<num;j++){
           if(num%j==0){
               flag=false;
               break;
           }
       }
       return flag;
   }
%>
<%
    List<Integer> prims=new ArrayList();
    for (int i = 2; i <=1000 ; i++) {
     if(isPrime(i)){
         //out.println("<h1>"+i+"<h1>");
         prims.add(i);
     }
    }
%>
<%
    for(int p:prims){
        //out.println("<h1>"+p+"是质数");
%>
<h5 style="color: red"><%=p%>是质数</h5>

<%}%>
</body>
</html>
