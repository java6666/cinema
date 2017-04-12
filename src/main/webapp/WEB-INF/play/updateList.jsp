<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: HY_PC
  Date: 2017-4-11
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="/update" method="post">
    <input type="hidden" name="playId" value="${requestScope.title.playId}">
    影片ID:<input name="playMovie" value="${requestScope.title.playMovie}">
    场次时间:<input name="playTime" value="<f:formatDate
        value="${requestScope.title.playTime}" pattern="yyyy-MM-dd"/>" >
    场次价钱:<input name="playPrice" value="${requestScope.title.playPrice}">
    <button>修改</button>
</form>
</body>
</html>
