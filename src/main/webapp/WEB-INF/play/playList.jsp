
<%--
  Created by IntelliJ IDEA.
  User: HY_PC
  Date: 2017-4-11
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>场次管理页面</title>
</head>
<body>

<form action="/test/addPlay" method="post">
    影片ID:<input  name="playMovie">
    场次时间：<input type="date" name="playTime">
    场次价钱:<input  name="playPrice">
    <input type="submit" value="保存">
</form>
<br/><br/>
<table border="1" style="text-align: center">
    <tr>
        <td>编号</td>
        <td>影片ID</td>
        <td>场次时间</td>
        <td>场次价钱</td>
        <td colspan="2">功能</td>
    </tr>
    <c:forEach items="${requestScope.list}" var="item">
        <tr>
            <td>${item.playId}</td>
            <td>${item.playMovie}</td>
            <td><f:formatDate value="${item.playTime}" pattern="yyyy-MM-dd"/> </td>
            <td>${item.playPrice}</td>
            <td><a href="/test/delete?playId=${item.playId}">删除</a> </td>
            <td><a href="/test/update?playId=${item.playId}">修改</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
