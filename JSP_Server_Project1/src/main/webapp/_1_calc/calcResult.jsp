<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 1. 29.
  Time: 오후 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calcResult</title>
</head>
<body>
    <h2>num1 : ${param.num1}</h2>
    <h2>num2 : ${param.num2}</h2>
<h3>합 : ${Integer.parseInt(param.num1) + Integer.parseInt(param.num2)}</h3>
</body>
</html>
