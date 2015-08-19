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

    <script type="text/javascript">
        $(document).ready(function () {


            $("tr").on("click", function () {
                $("#list").modal();
                var tr = $(this).closest('tr')[0];
                $(tr).addClass("selected");
                var foodID = tr.children[0].innerHTML;
                var foodName = tr.children[1].innerHTML;
                $("#name").val(foodID);
                $("#pwd").val(foodName);
//                alert($(this).text);
            });
            $("#save").on("click", function () {

                $("tr[class=selected]").children[0].val($("#name").val());
                $("tr[class=selected]").children[1].val($("#pwd").val());
//                tr.children[1].innerHTML = $("#pwd").val();
                $("#list").modal('hide');
                $(".selected").removeClass();
            });
            $("#testJson").on("click", function () {
                $.getJSON("/userList", {}, function (data) {
                    $("#modal").modal();
//                    alert(data);
                })
            });
            $("#bookList").on("click", function () {
                $.getJSON("/bookList", {}, function (data) {
                    $("#modal").modal();
//                    alert(data);
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
                <input id="name" type="text">
                <input id="pwd" type="text">
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
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
        <td>
            <button type="button" data-loading-text="Loading..." class="btn btn-primary"
                    autocomplete="off">
                showDetail
            </button>
        </td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Jacob</td>
        <td>Thornton</td>
        <td>@fat</td>
        <td>
            <button type="button" data-loading-text="Loading..." class="btn btn-primary"
                    autocomplete="off">
                add to car
            </button>
        </td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Larry</td>
        <td>the Bird</td>
        <td>@twitter</td>
        <td>
            <button type="button" data-loading-text="Loading..." class="btn btn-primary"
                    autocomplete="off">
                add to car
            </button>
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>
