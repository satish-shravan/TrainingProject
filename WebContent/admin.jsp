<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN </title>
</head>
<body>
	 <form action="admin" method="POST">
        <pre>
        Admin Id  : <input type="number" name="admin_id" /><br>
        Username  : <input type="text" name="name" /><br>
        Email     : <input type="email" name="email" /><br>
        Password  : <input type="password" name="password" /><br>
                    <input type="submit" value="Add Admin" /><br>
       </pre>
     </form>

</body>
</html>