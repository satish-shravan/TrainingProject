<%@ include file="header.jsp" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>COURSE</title>
</head>
<body>

<h4><u>Enroll for Course</u></h4>

	<form action="enroll_course" method="POST">
		<pre>
        User Id    : <input type="number" name="u_id" /><br>
        Course Id  : <input type="text" name="c_id" /><br>
                 <input type="submit" value="Enroll for Course" /><br>
       </pre>
	</form>
	<h4><u>All Course</u></h4>
	<%@ include file="allCourse.jsp" %> 
	

</body>
</html>