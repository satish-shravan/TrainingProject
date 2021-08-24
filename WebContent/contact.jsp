<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CONTACT </title>
</head>
<body>
	 <form action="contact" method="POST">
        <pre>
        User Id   : <input type="number" name="user_id" /><br>
        Contact Id: <input type="number" name="contact_id" /><br>
        name      : <input type="text" name="name" /><br>
        message   : <input type="text" name="message" /><br>
        Email     : <input type="email" name="email" /><br>
        Phone#    : <input type="number" name="phone" /><br>
                    <input type="submit" value="Add Contact" /><br>
       </pre>
     </form>

</body>
</html>