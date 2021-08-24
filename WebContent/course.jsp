<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>COURSE</title>
</head>
<body>
	<form action="course" method="POST">
		<pre>
        Course Id    : <input type="number" name="c_id" /><br>
        Course name  : <input type="text" name="c_name" /><br>
        Description  : <input type="text" name="c_desc" /><br>
        Fees         : <input type="number" name="c_fee" /><br>
        Resourse     : <input type="text" name="c_res" /><br>
                    <input type="submit" value="Add Course" /><br>
       </pre>
	</form>

</body>
</html>