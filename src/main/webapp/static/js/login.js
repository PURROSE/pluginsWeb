$(document).ready(function () {
    $("#res-tab").hide();
    $("#loginSubmit").on("click",function () {
        loginSub();
    });
    $("#resSubmit").on("click",function () {
        userRes();
    });
});

var changeTab = function (type) {
    if (type=="login"){
        $("#res-tab").hide();
        $("#login-tab").show();

        $("#res-email").val("");
        $("#res-phone").val("");
        $("#res-pawd0").val("");
        $("#res-pawd1").val("");
        $("#res-name").val("");
    }else {
        $("#res-tab").show();
        $("#login-tab").hide();

        $("#loginEmail").val("");
        $("#loginPawd").val("");
    }
}
function loginSub () {
    var userData = user("","","",$("#loginEmail").val(),$("#loginPawd").val(),"","");
    var retMsg = getAjax("http://127.0.0.1:8080/Plugins/login/login",userData,false,"post");
    if (retMsg=="success"){
        window.location.href = "http://127.0.0.1:8080/Plugins/index/";
    }else {
        $("#errorMessage").val(retMsg);
    }
}
var userRes = function () {
    var userData = user("",$("#res-name").val(),$("#res-phone").val(),$("#res-email").val(),$("#res-pawd0").val(),"1","0");
    var retMsg = getAjax("http://127.0.0.1:8080/Plugins/login/res",userData,false,"post");
    if (retMsg=="success"){
        window.location.href = "http://127.0.0.1:8080/Plugins/index/";
    }else {
        alert("注册失败")
    }
}
