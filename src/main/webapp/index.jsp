<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta http-equiv="Content-Type" content="text/html" ; charset="utf-8">
<html>
<head>

</head>
<body>
<h2>Hello World!</h2>
<h2><a href="/user/showUser">showAllUser</a></h2>
<h2><a href="/user/findUserById">findUserById</a></h2>
<h2><a href="/user/findUserByPhone">findUserByPhone</a></h2>
<h2><a href="/user/deleteUserById">deleteUserById</a></h2>
<form method="post" name="user"  action="/user/addUser">
    id <input name="id" type="text"/> <br>
    name <input name="userName"  type="text"/><br>
    phone <input name="userPhone"  type="text"/><br>
    email <input name="userEmail"  type="text"/><br>
    password <input name="userPwd"  type="text"/><br>
    salt <input name="pwdSalt" type="text" /><br>
    createTime<input name="createTime" type="datetime" /><br>
    modifyTime<input name="modifyTime" type="datetime" /><br>
    isDelete <select name="isDelete" ><br>
 <option name="yes" value="1">yes</option>
        <option name="no" value="0" selected="selected">no</option>
    </select>


    <button type="reset " value="reset">reset</button> <button type="submit" value="submit">submit</button>



</form>
</body>
</html>
