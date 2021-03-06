<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/4/11
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑个人信息</title>
</head>
<body>
<table border="1">
    <form action="/user/updateMember" method="post">
        <input type="hidden" name="id" value="${temp.memberId}">
        <tr>
            <td>邮箱</td>
            <td><input type="email" name="email" value="${temp.memberEmail}"></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="${temp.memberName}"></td>
        </tr>

        <tr>
            <td>电话</td>
            <td><input type="tel" name="phone" value="${temp.memberPhone}"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <c:if test="${temp.memberGender==1}">
                    男<input type="radio" name="gender" value="1" checked>
                    女<input type="radio" name="gender" value="0" >
                </c:if>

                <c:if test="${temp.memberGender==0}">
                    男<input type="radio" name="gender" value="1" >
                    女<input type="radio" name="gender" value="0" checked>
                </c:if>
            </td>
        </tr>
        <tr>
            <td>图片</td>
            <td><input type="text" name="photo" value="${temp.memberPhoto}"></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">提交</button>
            </td>

        </tr>
    </form>


</table>

</body>
</html>
