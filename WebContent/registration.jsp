<%@ include file="header.jsp" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register </title>
</head>
<body>
	 <form action="user_register" method="POST">
        <pre>
        User Id   : <input type="number" name="user_id" /><br>
        Reg Date  : <input type="text" name="reg_date" /><br/>
        Username  : <input type="text" name="name" /><br>
        Address   : <input type="text" name="address" /><br>
        Email     : <input type="email" name="email" /><br>
        Password  : <input type="password" name="password" /><br>
        Photo     : <input type="text" name="upload_photo" /><br>
        Phone#    : <input type="number" name="phone" /><br>
                    <input type="submit" value="Sign Up" /><br>
                    <a href="login.jsp">Login</a>
       </pre>
     </form>

</body>
</html>