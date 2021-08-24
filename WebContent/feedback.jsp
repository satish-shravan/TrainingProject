<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FEEDBACK </title>
</head>
<body>
	 <form action="feedback" method="POST">
        <pre>
        Feedback Id   : <input type="number" name="f_id" /><br>
        User Id       : <input type="number" name="user_id" /><br>
        Name          : <input type="text" name="name" /><br>
        Feedback      : <input type="text" name="feedback" /><br>
        Email         : <input type="email" name="email" /><br>
                    <input type="submit" value="Add Feedback" /><br>
       </pre>
     </form>

</body>
</html>