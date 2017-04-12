<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/4/11
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<table border="1">
    <tr>
        <td>Email</td>
        <td>姓名</td>
        <td>电话</td>
        <td>性别</td>
        <td>修改信息</td>
        <td>修改密码</td>
    </tr>
    <tr>
        <td>${temp.memberEmail}</td>
        <td>${temp.memberName}</td>
        <td>${temp.memberPhone}</td>
        <td><c:if test="${temp.memberGender==0}">女</c:if>
            <c:if test="${temp.memberGender==1}">男</c:if>
        </td>
        <td>
            <a href="/updateMember"><button type="button">修改信息</button></a>
        </td>
        <td>
            <a href="/updatePwd"><button type="button">修改密码</button></a>
        </td>
    </tr>

</table>

</body>
</html>
