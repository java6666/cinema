<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: HY_PC
  Date: 2017-4-12
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>影片信息管理</title>
</head>
<body>
<form action="/query" method="get">
    电影名称:<input name="movieName">
    <button type="submit">查询</button>
</form>

<form action="/addMovie" method="post">
    影片名称:<input name="movieName"><br/>
    影片导演:<input name="movieDirector"><br/>
    影片演员:<input name="movieActor"><br/>
    影片信息:<input name="movieInfo"><br/>
    语言ID:<input name="movieLanguage"><br/>
    类别ID:<input name="movieKind"><br/>
    照片地址:<input name="moviePhoto"><br/>
    影片片长:<input name="movieLong"><br/>
    上映日期:<input name="movieDate" type="date"><br/>
    影片版本:<input name="movieEdition"><br/>
    <button type="submit">保存</button>
</form>
    <br/><br/>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>影片名称</td>
            <td>影片导演</td>
            <td>影片演员</td>
            <td>影片信息</td>
            <td>语言ID</td>
            <td>类别ID</td>
            <td>照片地址</td>
            <td>影片片长</td>
            <td>上映日期</td>
            <td>影片版本</td>
            <td colspan="2">功能</td>
        </tr>
        <c:forEach items="${requestScope.list}" var="item">
            <tr>
                <td>${item.movieId}</td>
                <td>${item.movieName}</td>
                <td>${item.movieDirector}</td>
                <td>${item.movieActor}</td>
                <td>${item.movieInfo}</td>
                <td>${item.movieLanguage}</td>
                <td>${item.movieKind}</td>
                <td>${item.moviePhoto}</td>
                <td>${item.movieLong}</td>
                <td><f:formatDate value="${item.movieDate}" pattern="yyyy-HH-dd"/></td>
                <td>${item.movieEdition}</td>
                <td><a href="/deleteMovie?movieId=${item.movieId}">删除</a> </td>
                <td><a href="/updateMovie?movieId=${item.movieId}">修改</a> </td>


            </tr>
        </c:forEach>
    </table>
<c:if test="${requestScope.pageInfo!=null}">
<td>共${requestScope.pageInfo.pageSize}页</td>
<td>第${requestScope.pageInfo.pageNum}页</td>
<td><a href="/query?page=1&movieName=${requestScope.movieName}">首页</a> </td>
<c:if test="${requestScope.pageInfo.hasPreviousPage}">
<td><a href="/query?page=${item.pageInfo.prePage}&movieName=${requestScope.movieName}">上一页</a> </td>
</c:if>
<c:if test="${requestScope.pageInfo.hasNextPage}">
<td><a href="/query?page=${item.pageInfo.nextPage}&movieName=${requestScope.movieName}">下一页</a> </td>
</c:if>
<td><a href="/query?page=${requestScope.pageInfo.pageSize}&movieName=${requestScope.movieName}">尾页</a> </td>
</c:if>

</body>
</html>
