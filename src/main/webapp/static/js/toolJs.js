var getAjax = function (url,data,ans,type) {
    var retData;
    $.ajax({
        url:url,
        data:data,
        type:type,
        dataType:"json",
        async:ans,
        success:function (returnData) {
            retData = returnData;
        },
        error:function (errorMesg) {
            console.log(errorMesg);
        }
    });
    return retData;
}