<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta http-equiv="Content-Type" content="text/html" charset="utf-8">
<html>
<head>

</head>
<body>
<h2>Test Web-SSM</h2>
<h2><a href="/user/showUser">showAllUser</a></h2>
<h2><a href="/user/findUserById">findUserById</a></h2>
<h2><a href="/user/findUserByPhone">findUserByPhone</a></h2>
<h2><a href="/user/deleteUserById">deleteUserById</a></h2>
<div style="width: 500px;height: 600px;border: #ff1524 solid 2px; align-content: center ;margin-left: 30%">
<form method="post" name="user" action="/user/addUser">
    id <input name="id" type="text"/> <br>
    name <input name="userName" type="text"/><br>
    phone <input name="userPhone" type="text"/><br>
    Email <input name="userEmail" type="text"/><br>
    password <input name="userPwd" type="text"/><br>
    salt <input name="pwdSalt" type="text" /><br>
    createTime<input name="createTime" type="datetime" /><br>
    modifyTime<input name="modifyTime" type="datetime" /><br>
    isDelete <select name="isDelete" ><br>
    <option name="yes" value="1">yes</option>
    <option name="no" value="0" selected="selected">no</option>
</select>


    <button type="reset " value="reset">reset</button> <button type="submit" value="submit">submit</button>


</form>
</div>
<div style="width: 500px;height: 600px;border: #ff1524 solid 2px; align-content: center ;margin-left: 30%">
    <form action="/student/addStudent" method="post">
        ID<input type="text" name="id"/><br>
        name<input type="text" name="name"/><br>
        address<input type="text" name="address"/><br>
        <button type="reset">reset</button>
        <button type="submit">submit</button>
    </form>


</div>
</body>
</html>
