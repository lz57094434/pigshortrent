$(function () {
    $('.fileupload').fileupload({
        url: "/uploadFile",
        Type: 'POST',//请求方式 ，可以选择POST，PUT或者PATCH,默认POST
        dataType: 'json',//服务器返回的数据类型
        // singleFileUploads: false,//不设置多个文件循环提交，设置后一起提交

        //add函数为选择文件后执行的操作
        add: function (e, data) {
            //获取图片路径并显示预览
            var url = getUrl(data.files[0]);
            var $img = $("<img>").attr("src", url).css("width","50px");

            $.ajax({
                url:"/Imginsert",
                data:{"houseImgUrl":url},
                dataType:"json",
                success:function () {

                }
            })
            $("#image").append($img);
            //绑定上传提交事件
            $("button").click(function () {
                data.submit();


            });
        },
        //done函数为上传成功后执行的操作
        done: function (e, ret) {
            if (ret.result.errno == 0) {
                // 显示上传成功，并循环输出上传内容预览。
                $("#image").append("<div>上传成功:" + ret.result.data + "</div>");
                $("input[type='hidden']").val(ret.result.data);
            } else {
                alert("上传失败");
            }

        }

        //dropZone: $('#dropzone') //此为拖拽文件控制，暂未开发。
    });
});
//获取图片地址
function getUrl(file) {
    var url = null;
    if (window.createObjectURL != undefined) {
        url = window.createObjectURL(file);
    } else if (window.URL != undefined) {
        url = window.URL.createObjectURL(file);
    } else if (window.webkitURL != undefined) {
        url = window.webkitURL.createObjectURL(file);
    }
    return url;
}
