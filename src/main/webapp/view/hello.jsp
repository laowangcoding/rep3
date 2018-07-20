<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/18
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   hello ${name}
    <form action="${pageContext.request.contextPath}/test2.do" method="post">
        <input type="text" name="username">
        <input type="text" name="age">
        <input type="submit" value="提交">
    </form>
</body>
</html>
