<%--
  Created by IntelliJ IDEA.
  User: cj34920
  Date: 2017/4/19
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>

<%
    String path = request.getContextPath();
    String socketPath = request.getServerName() + ":" + request.getServerPort() + path + "/"; %>
<script src="<%=path%>/static/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">

    function WebSocketTest() {
        if ("WebSocket" in window) {
            alert("您的浏览器支持 WebSocket!");

            // 打开一个 web socket
            var ws = new WebSocket("ws:" + "<%=socketPath%>" + "/myHandler");

            ws.onopen = function () {
                // Web Socket 已连接上，使用 send() 方法发送数据
                ws.send("发送数据");
                alert("数据发送中...");
            };

            ws.onmessage = function (evt) {
                var received_msg = evt.data;
                console.log(received_msg);
                alert("数据已接收...");
            };

            ws.onclose = function () {
                // 关闭 websocket
                alert("连接已关闭...");
            };
        }

        else {
            // 浏览器不支持 WebSocket
            alert("您的浏览器不支持 WebSocket!");
        }
    }
    function sendbroadcast() {
        var path = "<%=request.getContextPath()%>";
        location.href = path + "/test/broadcast";
    }
</script>
<body>
<div id="sse">
    <a href="javascript:WebSocketTest()">运行 WebSocket</a>
    <a href="javascript:sendbroadcast()">发送消息</a>
</div>

</body>
</html>