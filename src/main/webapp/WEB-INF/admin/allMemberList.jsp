<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/4/10
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<table border="1" >
    <tr>
        <td>Email</td>
        <td>密码</td>
        <td>姓名</td>
        <td>电话</td>
        <td>余额</td>
        <td>性别</td>
        <td>修改</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${requestScope.list}" var="item">
        <tr>
            <td>${item.memberEmail}</td>
            <td>${item.memberPwd}</td>
            <td>${item.memberName}</td>
            <td>${item.memberPhone}</td>
            <td>${item.memberMoney}</td>
            <td><c:if test="${item.memberGender==0}">女</c:if>
                <c:if test="${item.memberGender==1}">男</c:if>
            </td>
            <td><a href="/admin/updateMember?memberId=${item.memberId}">修改</a></td>
            <td><a href="/admin/deleteMember?memberId=${item.memberId}">删除</a></td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
