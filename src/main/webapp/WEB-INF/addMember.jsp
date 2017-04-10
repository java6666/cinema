<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/4/9
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addMember" method="post">
    姓名<input type="text" name="name" ><span>${requestScope.temp}</span><br/>
    密码<input type="password" name="password" ><br/>
    电话<input type="tel" name="phone" ><br/>
    邮件<input type="email" name="email"><br/>
    性别: 男<input type="radio" name="gender" value="1" checked>&nbsp;女<input type="radio" name="gender" value="0"> <br/>
    照片<input type="text" name="photo" ><br/>
    <button type="submit">提交</button>
</form>

</body>
</html>
