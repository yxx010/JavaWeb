
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
<h1>文件上传</h1>
<form action="/UploadServlet" method="post" enctype="multipart/form-data">
    <input type="text" name="name"><br/>
    <input type="file" name="upload"><br/>
    <input type="submit" value="上传">
</form>
</body>
</html>
