$(function () {
    getUsers();
});

var getUsers = function(){
    var retMsg = getAjax("http://127.0.0.1:8080/Plugins/tool/session",{sessionName:"user"},false,"get");
    if (retMsg==null){
        console.log("error");
    }else {
        console.log("success");
    }
}