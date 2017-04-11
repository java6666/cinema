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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <style>
        .carousel{height:500px;background-color:#000;}
        .carousel .item{height:500px;background-color:#000;}
        .carousel img{width:100%;}
        .carousel-caption p{margin-bottom:20px;font-size:20px;line-height:1.8;}
    </style>
    <title>主页</title>
</head>
<body>

<%-- 导航 --%>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Brand</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-left">
                <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                <li><a href="#">Link</a></li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="请输入片名">
                </div>
                <button type="submit" class="btn btn-default">搜索影片</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a class="btn" data-target="#mymodal">登陆</a></li>
                <li><a class="btn">注册</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div class="container theme-showcase" >
    <%--登录弹窗页面--%>
        <div class="modal fade" id="mymodal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" >
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title">注册</h4>
                    </div>
                    <div class="modal-body">
                        <form action="/addMember" method="post">
                            姓名<input type="text" name="name" ><span>${requestScope.temp}</span><br/>
                            密码<input type="password" name="password" ><br/>
                            电话<input type="tel" name="phone" ><br/>
                            邮件<input type="email" name="email"><br/>
                            性别: 男<input type="radio" name="gender" value="1" checked>&nbsp;女<input type="radio" name="gender" value="0"> <br/>
                            照片<input type="text" name="photo" ><br/>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="submit" class="btn btn-primary">注册</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        <script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
        <script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-transition.js"></script>
        <script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-modal.js"></script>
        <script>
            $(function(){
                $(".btn").click(function(){
                    $("#mymodal").modal("toggle");
                });
            });
        </script>

<%-- 动态广告 --%>
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class=""></li>
        <li data-target="#carousel-example-generic" data-slide-to="1" class=""></li>
        <li data-target="#carousel-example-generic" data-slide-to="2" class=""></li>
        <li data-target="#carousel-example-generic" data-slide-to="3" class=""></li>
        <li data-target="#carousel-example-generic" data-slide-to="4" class="active"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img src="../css/image/65336.jpg" alt="1 slide">
            <div class="carousel-caption">
                <p>D.va</p>
            </div>
        </div>
        <div class="item">
            <img src="../css/image/69291.jpg" alt="2 slide">
            <div class="carousel-caption">
                <p>D.va</p>
            </div>
        </div>
        <div class="item">
            <img src="../css/image/fPzht.jpeg" alt="3 slide">
            <div class="carousel-caption">
                <p>D.va</p>
            </div>
        </div>
        <div class="item">
            <img src="../css/image/77d82.jpg" alt="4 slide">
            <div class="carousel-caption">
                <p>D.va</p>
            </div>
        </div>
        <div class="item">
            <img src="../css/image/72643.jpg" alt="5 slide">
            <div class="carousel-caption">
                <p>D.va</p>
            </div>
        </div>
    </div>
    <a class="left carousel-control"
       href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="sr-only">上一页</span>
    </a>
    <a class="right carousel-control"
       href="#carousel-example-generic" role="button" data-slide="next">
        <span class="sr-only">下一页</span>
    </a>
</div>
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<%-- 影片展示 --%>
        <div>
            <h1>热片</h1>
        </div>

        <div class="row">
            <div class="col-sm-6 col-md-4">
                <div class="thumbnail">
                    <img src="../css/image/3mNA.jpeg" width="250px" height="300px" alt="...">
                    <div class="caption">
                        <h3>片名</h3>
                        <p>影片介绍</p>
                        <p><a href="#" class="btn btn-primary" role="button">购票</a></p>
                    </div>
                </div>
            </div>
        </div>
</div>




<%--BGM--%>
<EMBED src="../css/BGM/Janji%20-%20Horizon.mp3" autostart="true" loop="-1" width="0" height="0" >
</body>
</html>
