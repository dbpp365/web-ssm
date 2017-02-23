<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/23
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>打印个人信息</title>
    <style src="/jquery-3.1.1.js"></style>
</head>
<body>
<script type="text/javascript">
    $(document).ready(
        function () {
            $("button #print_myself").click(
                function () {
                    alert("hah");
                    window.print();

                })

        })
    function open() {
        window.open("http://www.baidu.com", "_self", "width=300,height=400,resizable='no',scrollbars='no'");
    }
</script>
<c:if test="${!empty info}">
    <c:forEach var="student" items="${info}">
        <table style="align-content: center; border: red solid 1px">
            <th>
            <td>1</td>
            <td>2</td>
            <td>3</td>
            <td>4</td>
            <td>5</td>
            </th>
            <tr>
                <td rowspan="4">企业基<br>本情况</td>
                <td>企业名称</td>
                <td colspan="2"><input type="test" name="enterpriseName" value=${student.name}/></td>
            </tr>
            id ${student.id} address ${student.address}
        </table>
    </c:forEach>


</c:if>
<button id="print_myself" type="button" name="printSelf" value="Print" onclick="window.print();">点击打印</button>
<button id="print_myself" type="button" name="printSelf" value="Print" onclick=open()>点击打开</button>
</body>
</html>
