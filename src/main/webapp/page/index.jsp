<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/11
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>插件/首页</title>

    <script src="http://127.0.0.1:8080/Plugins/static/jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="http://127.0.0.1:8080/Plugins/static/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="http://127.0.0.1:8080/Plugins/static/js/toolJs.js" type="text/javascript"></script>

    <script src="http://127.0.0.1:8080/Plugins/static/js/index.js" type="text/javascript"></script>
    <script src="http://127.0.0.1:8080/Plugins/static/js/static.js" type="text/javascript"></script>

    <link href="http://127.0.0.1:8080/Plugins/static/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="http://127.0.0.1:8080/Plugins/static/css/static.css" rel="stylesheet" type="text/css">

    <link href="http://127.0.0.1:8080/Plugins/static/css/index.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="div-bg">
    <!--导航栏 -->
    <div class="div-nav">
        <nav class="navbar navbar-default" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="http://127.0.0.1:8080/Plugins/index/">插件</a>
                </div>
                <div>
                    <ul class="nav navbar-nav">
                        <li><a href="#">最新资讯</a></li>
                        <li><a href="#">插件分类</a></li>
                        <li><a href="#">个人仓库</a></li>
                    </ul>
                </div>
                <div>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="http://127.0.0.1:8080/Plugins/login/"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
    <!--通知板块 -->
    <div class="div-not">
        <div class="div-carousel div-left">
            <div id="myCarousel" class="carousel slide">
                <!-- 轮播（Carousel）指标 -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <!-- 轮播（Carousel）项目 -->
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="http://127.0.0.1:8080/Plugins/static/image/carousel1.jpg" alt="First slide">
                        <div class="carousel-caption">标题 1</div>
                    </div>
                    <div class="item">
                        <img src="http://127.0.0.1:8080/Plugins/static/image/carousel1.jpg" alt="Second slide">
                        <div class="carousel-caption">标题 2</div>
                    </div>
                    <div class="item">
                        <img src="http://127.0.0.1:8080/Plugins/static/image/carousel1.jpg" alt="Third slide">
                        <div class="carousel-caption">标题 3</div>
                    </div>
                </div>
                <!-- 轮播（Carousel）导航 -->
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <div class="div-notice div-right panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">
                    网站通知
                </h3>
            </div>
            <div class="panel-body">
                <ul class="list-group">
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                </ul>
            </div>
        </div>
        <div class="div-clearFloat"></div>
    </div>
    <!--博客板块-->
    <div class="div-blog">
        <!--推荐博客 -->
        <div class="div-blog-remd panel panel-default div-left">
            <div class="panel-heading">
                <h3 class="panel-title">
                    博客推荐
                </h3>
            </div>
            <div class="panel-body">
                <ul class="list-group">
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                </ul>
            </div>
        </div>
        <!--本月最受欢迎博客 -->
        <div class="div-blog-top panel panel-default div-right">
            <div class="panel-heading">
                <h3 class="panel-title">
                    最新资讯
                </h3>
            </div>
            <div class="panel-body">
                <ul class="list-group">
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                </ul>
            </div>
        </div>
        <div class="div-clearFloat"></div>
    </div>
    <!--插件榜单 -->
    <div class="div-plugins-list">
        <!--最受欢迎插件榜 -->
        <div class="div-plugins-like panel panel-default div-left">
            <div class="panel-heading">
                <h3 class="panel-title">
                    本月热门插件
                </h3>
            </div>
            <div class="panel-body">
                <ul class="list-group">
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                </ul>
            </div>
        </div>
        <!--本月下载最多插件榜 -->
        <div class="div-plugins-top panel panel-default div-right">
            <div class="panel-heading">
                <h3 class="panel-title">
                    下载最多插件
                </h3>
            </div>
            <div class="panel-body">
                <ul class="list-group">
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                    <a class="list-group-item"> 测试连接</a>
                </ul>
            </div>
        </div>
        <div class="div-clearFloat"></div>
    </div>
    <!--脚注 -->
    <footer>
        <div class="div-footer">
            <a href="#">联系我们</a>
        </div>
    </footer>
</div>
</body>
</html>
