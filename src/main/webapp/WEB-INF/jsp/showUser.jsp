<%--
  Created by IntelliJ IDEA.
  User: Zhangxq
  Date: 2016/7/16
  Time: 0:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>用户信息列表</title>


</head>
<body>
<script src="/jquery-3.1.1.js"></script>
<script src="/jquery.PrintArea.js"></script>

<script type="text/javascript">
    $(document).ready(function () {
        $("input#print_button").click(function () {
            alert("hsh");
            $("div#myPrintArea").printArea();

        });
    });

</script>
<div id="myPrintArea" style="border: red solid 2px">

    <c:if test="${!empty userList}">
        <c:forEach var="user" items="${userList}">
            姓名：${user.userName} &nbsp;&nbsp;手机号：${user.userPhone} &nbsp;&nbsp;邮箱：${user.userEmail} &nbsp;&nbsp;<br>
        </c:forEach>
    </c:if>
</div>
<input id="print_button" type="button" value="打印"/>
<%--<a href="javascript:window.print()" target="_self">打印</a>--%>
<a href="javascript:windows.open(" Print/byID",_blank)>去打印</a>
</body>
</html>
