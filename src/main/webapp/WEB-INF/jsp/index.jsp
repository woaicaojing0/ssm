<%--
  Created by IntelliJ IDEA.
  User: cj34920
  Date: 2017/2/27
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title></title>
</head>
<script src="<%=request.getContextPath()%>/static/js/jquery-1.8.0.min.js"></script>
<script src="<%=request.getContextPath()%>/static/element/js/vue.min.js"></script>
<script src="<%=request.getContextPath()%>/static/element/js/index.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/element/css/index.css"/>
<script src="<%=request.getContextPath()%>/static/js/vueapp.js"></script>

<body>
<input type="button" class="btn-primary" width="100px" height="100px" style="margin-top: 20px"
       value="${user.user_name}"/>
<div id="app-2">
  <span v-bind:title="message">
    鼠标悬停几秒钟查看此处动态绑定的提示信息！
  </span>
</div>
<div id="app">
    <el-button>默认按钮</el-button>
    <el-button type="primary">主要按钮</el-button>
    <el-button type="text">文字按钮</el-button>
</div>
</body>
</html>
