<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#jsonTest").click(function () {
                $.ajax({
                    type: "POST",
                    url: "/json",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"id":1,"username":"张三","password":"1234","age":22,"birthday":"1999-09-09"}',
                    dataType: "json",
                    success:function(d){
                        // 编写很多代码
                        alert(d.username+" - "+d.age);
                    }
                });
            })
        })
    </script>
</head>
<body>
<form action="/login" method="post">
    username:<input type="text" name="username"/><br>
    password:<input type="text" name="password"/><br>
    age:<input type="text" name="age"/><br>
    birthday:<input type="text" name="birthday"/><br>
    <input type="submit" value="提交"/>
</form>

<input type="button" id="jsonTest" value="jsonTest"/>
<a href="/json1">responseBody</a>
</body>
</html>