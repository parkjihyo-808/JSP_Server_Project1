<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 1. 29.
  Time: 오후 4:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--임시로 한글 안깨지게 인코딩 설정--%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<head>
    <title>주문 결과창</title>
</head>
<body>
<h1>주문 내역</h1>
<h2>주문 메뉴 : ${param.menuName}</h2>
<h2>가격 : 10000원 </h2>
</body>
</html>
