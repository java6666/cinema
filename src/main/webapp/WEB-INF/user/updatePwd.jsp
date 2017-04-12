

<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/4/11
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        function CheckPost() {
            var password = document.getElementById("password").value;
            var repassword = document.getElementById("rePassword").value;

            if(password!=repassword){
                window.alert("您输入的新密码与确认密码确认不一致");
                return false;

            }
                return true;

        }
    </script>
</head>
<body>
<form action="/user/updatePwd" id="f1" method="post" onsubmit="return CheckPost();">
    原密码<input type="password" name="passwordO"><span>${requestScope.temp}</span><br/>
    新密码<input type="password" id="password" name="password"><br/>
    再输一次<input type="password" id="rePassword" name="repassword"><br/>
    <input  type="submit" value="提交">
</form>



</body>
</html>