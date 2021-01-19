<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>插件/登录</title>

    <link href="http://127.0.0.1:8080/Plugins/static/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="http://127.0.0.1:8080/Plugins/static/css/static.css" rel="stylesheet" type="text/css">

    <link href="http://127.0.0.1:8080/Plugins/static/css/login.css" rel="stylesheet" type="text/css">

    <script src="http://127.0.0.1:8080/Plugins/static/jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="http://127.0.0.1:8080/Plugins/static/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="http://127.0.0.1:8080/Plugins/static/js/toolJs.js" type="text/javascript"></script>

    <script src="http://127.0.0.1:8080/Plugins/static/js/static.js" type="text/javascript"></script>
    <script src="http://127.0.0.1:8080/Plugins/static/js/login.js" type="text/javascript"></script>
</head>
<body>
    <div class="div-bg">
        <div class="div-login">
            <table id="login-tab">
                <tr>
                    <td>
                        <span>
                        邮箱：
                    </span>
                    </td>
                    <td>
                        <input id="loginEmail" type="text">
                    </td>
                </tr>
                <tr>
                    <td>
                        <span>
                            密码：
                        </span>
                    </td>
                    <td>
                        <input id="loginPawd" type="password">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <span class="errorMsg" id="errorMessage">

                        </span>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input id="loginSubmit" type="button" value="登录">
                    </td>
                </tr>
                <tr>
                    <td>
                    </td>
                    <td>
                        <button class="btn-link" onclick="changeTab('res')">
                            注册
                        </button>
                    </td>
                </tr>
            </table>
            <table id="res-tab">
                <tr>
                    <td>
                        <span>
                            邮箱：
                        </span>
                    </td>
                    <td>
                        <input id="res-email" type="text">
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td>
                        电话:
                    </td>
                    <td>
                        <input id="res-phone" type="text">
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td>
                        昵称:
                    </td>
                    <td>
                        <input id="res-name" type="text">
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td>
                        <span>
                            密码：
                        </span>
                    </td>
                    <td>
                        <input id="res-pawd0" type="password">
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td>
                        <span>
                            确认密码：
                        </span>
                    </td>
                    <td>
                        <input id="res-pawd1" type="password">
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td>

                    </td>
                    <td>
                        <button id="resSubmit">
                            注册
                        </button>
                    </td>
                </tr>
                <tr>
                    <td>

                    </td>
                    <td>
                        <button class="btn-link" onclick="changeTab('login')">
                            登录
                        </button>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</body>
</html>
