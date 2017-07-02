<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: HY_PC
  Date: 2017-4-12
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="/update" method="post">
    <input type="hidden" name="movieId" value="${requestScope.title.movieId}"><br/>
    影片名称:<input name="movieName" value="${title.movieName}"><br/>
    影片导演:<input name="movieDirector" value="${title.movieDirector}"><br/>
    影片演员:<input name="movieActor" value="${title.movieActor}"><br/>
    影片信息:<input name="movieInfo"  value="${title.movieInfo}"><br/>
    语言ID:<input name="movieLanguage" value="${title.movieLanguage}"><br/>
    类别ID:<input name="movieKind" value="${title.movieKind}"><br/>
    照片地址:<input name="moviePhoto" value="${title.moviePhoto}"><br/>
    影片片长:<input name="movieLong" value="${title.movieLong}"><br/>
    上映日期:<input  name="movieDate"
                 value="<f:formatDate value="${title.movieDate}" pattern="yyyy-HH-dd"/>"><br/>
    影片版本:<input name="movieEdition" value="${title.movieEdition}"><br/>
    <button>修改</button>

</form>
</body>
</html>

