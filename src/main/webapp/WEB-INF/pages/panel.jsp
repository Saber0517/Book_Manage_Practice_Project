<%--
  Created by IntelliJ IDEA.
  User: WhiteSaber
  Date: 15/8/18
  Time: 下午8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script type="text/css">
        body {
            margin: 80px;
        }

        .table {
            margin-left: auto;
            margin-right: auto;
        }
    </script>
    <script type="text/javascript">
        $(document).ready(function () {

            $.getJSON("/bookList", function (json) {
//                var json = $.parseJSON(msg);
                console.log("Data Saved: " + json);
                $.each(json, function (i, value) {
                    console.log("i :" + i + " value:" + value);
                    var tr = $('<tr></tr>');
                    tr.append('<th scope="row">' + i + '</th>');
                    tr.append('<td>' + value.bookId + '</td>');
                    tr.append('<td>' + value.bookName + '</td>');
                    tr.append('<td>' + value.price + '</td>');
//                    tr.append('<td><button type="button" data-loading-text="Loading..." class="btn btn-primary"autocomplete="off">showDetail</button></td>');
                    $("tbody").append(tr);
                });
                bindingBtn();

            });

            var bindingBtn = function () {
                $("tr").on("click", function () {
                    $("#list").modal();
                    var tr = $(this).closest('tr')[0];
                    $(tr).addClass("selected");
                    var bookID = tr.childNodes[1].innerHTML;
                    var bookName = tr.childNodes[2].innerHTML;
                    var bookPrice = tr.childNodes[3].innerHTML;
                    $("#bookName").val(bookName);
                    $("#bookPrice").val(bookPrice);
                });
            };

            $("#list").on("hidden.bs.modal", function (e) {
                $(".selected").removeClass();
            });


            $("#save").on("click", function () {
                console.log($("#bookName").text);
                console.log($("#bookPrice").text);
                $("#list").modal('hide');
                $.get("/changeBook", {name: $("#bookName").text, time: $("#bookPrice").text},
                        function (data) {
                            alert("Data Loaded: " + data);
                        });
            });


            $("#testJson").on("click", function () {
                $.getJSON("/userList", {}, function (data) {
                    $("#modal").modal();
                    console.log(data);
                })
            });

            $("#bookList").on("click", function () {
                $.getJSON("/bookList", {}, function (data) {
                    $("#modal").modal();
                    console.log(data);
                })
            });
        });

    </script>
</head>
<body>
<!-- Large modal -->
<button id="bookList" type="button" class="btn btn-primary">
    testBookList
</button>
<button id="testJson" type="button" class="btn btn-primary">
    testJson
</button>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">Large modal
</button>

<div id="list" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <div class="modal-body">
                <input id="bookName" type="text">
                <input id="bookPrice" type="text">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button id="save" type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>
<table class="table table-hover">
    <thead>
    <tr>
        <th>#</th>
        <th>BookId</th>
        <th>BookName</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <tr>
    </tr>
    </tbody>
</table>
</body>
</html>
