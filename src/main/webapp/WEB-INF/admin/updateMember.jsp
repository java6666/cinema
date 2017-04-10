<%--
  Created by IntelliJ IDEA.
  User: LVXI157
  Date: 2017/4/10
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>更新用户信息</title>
</head>
<body>

<table bgcolor="#98FB98" bordercolor="#68838B" border="1" width=""  cellpadding="7" cellspacing="0"  align="center">
    <tr >
        <th align="center" colspan="2" bgcolor="blue" >更新会员信息</th>

    </tr>
    <form action="/updateMember" method="post">
    <tr id="table-tr-2">
        <td width="10" >会员序号</td>
        <td><input type="text" readonly="readonly" name="memberId" value="${requestScope.memberId}"/></td>
    </tr>
    <tr>
        <td>邮箱</td>
        <td><input type="text" name="memberEmail" value="${requestScope.member.memberEmail}" /></td>
        </tr>
    <tr>
        <td>会员名</td>
        <td><input type="text" name="memberName" value="${requestScope.member.memberName}"/></td>
        </tr>
    <tr>
        <td>密码</td>
        <td><input type="text" name="memberPwd" value="${requestScope.member.memberPwd}"/></td>
    </tr>
    <tr>
        <td>电话</td>
        <td><input type="text" name="memberPhone" value="${requestScope.member.memberPhone}" /></td>
    </tr>
    <tr>
        <td>余额</td>
        <td><input type="text" name="memberMoney" value="${requestScope.member.memberMoney}"/></td>
    <tr>
        <td>性别</td>
    <td><input type="text" name="memberGender" value="${requestScope.member.memberGender}"/></td>
</tr>
    <tr>
        <td>照片</td>
        <td><input type="text" name="memberPhoto" value="${requestScope.member.memberPhoto}" /></td>
    </tr>
    <tr>
        <td>操作</td>
        <td>
            <input type="submit" value="确认修改" />
            <input type="reset" value="取消" />
        </td>
    </tr>
    </form>
</table>


</body>
</html>
