<%@ include file="header.jsp" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login </title>
</head>
<body>

<h4><u>Login to your account </u></h4>

	 <form action="login" method="POST">
        <pre>
        Email     : <input type="email" name="email" /><br>
        Password  : <input type="password" name="password" /><br>
                    <input type="submit" value="Login" /><br>
                    <a href="registration.jsp">Sign Up</a>
       </pre>
     </form>

</body>
</html>