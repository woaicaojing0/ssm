<%--
  Created by IntelliJ IDEA.
  User: cj34920
  Date: 2017/2/27
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title></title>
</head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/bootstrap.min.css">
<body>
<input type="button" class="btn-primary" width="100px" height="100px" style="margin-top: 20px" value="${user.user_name}"/>
${user.user_name}
</body>
</html>
