<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/10/11
  Time: 上午9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--存储在一次请求中,重定向获取不到参数--%>
<h1>你好~${username}</h1>
<%--用user取要写user的get/set方法--%>
<h4>${user.username}</h4>
</body>
</html>
