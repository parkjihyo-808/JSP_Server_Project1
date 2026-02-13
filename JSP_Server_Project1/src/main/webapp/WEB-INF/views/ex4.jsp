<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 2. 13.
  Time: 오후 4:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>ex4, 서버에서 model 객체를 이용헤 화면에 전달하고 화면에서는
전달 받은 데이터 사용</h1>
<h2>EL 표현법으로 간단히 표현: ${msg}</h2>
<h2>JSTL 표현식 이용해서 안전하게 출력</h2>
<h2><c:out value="${msg}"></c:out></h2>
<h2></h2>
</body>
</html>
