<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="user/testString">testString</a>
    <br/>

    <a href="user/testVoid">testVoid</a>
    <br/>

    <a href="user/testModelAndView">testModelAndView</a>
    <br/>

    <a href="user/testForwardOrRedirect">testForwardOrRedirect</a>
    <br/>

    <button id="btn">发送异步ajax</button>
</body>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btn").click(function () {
            $.ajax({
                url: "user/testAjax",
                contentType: "application/json;charset=UTF-8",
                data: '{"username":"hehe", "password":"123", "age":10}',
                dataType: "json",
                type: "post",
                success: function (data) {
                    alert(data.username);
                    alert(data.password);
                    alert(data.age);
                }
            });
        });
    });
</script>
</html>
