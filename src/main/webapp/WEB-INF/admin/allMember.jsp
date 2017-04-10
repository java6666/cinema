<%--
  Created by IntelliJ IDEA.
  User: LVXI157
  Date: 2017/4/10
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<title>查询所有用户信息</title>
</head>

<body style=" background-image: url(../../images/timg.jpg) ;width: 1440px;height: 900px; ">
<table bgcolor="#98FB98" bordercolor="#68838B" border="1" width=""  cellpadding="7" cellspacing="0"  align="center">
    <tr >
        <th align="center" colspan="9" bgcolor="blue" >查询所有会员信息</th>

    </tr>
    <tr id="table-tr-2">
        <td width="10">会员序号</td>
        <td>邮箱</td>
        <td>会员名</td>
        <td>密码</td>
        <td>电话</td>
        <td>余额</td>
        <td>性别</td>
        <td>照片</td>
        <td>操作</td>
    </tr>
    <c:forEach  items="${requestScope.membersList}" var="list" varStatus="status">

        <tr <c:if test="${status.count%2!=0}">id="table-tr-3"</c:if>>
            <td>${list.memberId}</td>
            <td>${list.memberEmail}</td>
            <td>${list.memberName}</td>
            <td>${list.memberPwd}</td>
            <td>${list.memberPhone}</td>
            <td>${list.memberMoney}</td>
            <td>${list.memberGender}</td>
            <td>${list.memberPhoto}</td>
            <td>
                <a href="deleteMember?memberId=${list.memberId}&memberName=${list.memberName}">删除</a>
                <a href="updateMember?memberId=${list.memberId}&memberName=${list.memberName}">更新</a>
            </td>

        </tr>

    </c:forEach>
</table>

</body>
</html>

