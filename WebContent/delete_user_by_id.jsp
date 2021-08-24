<%@ include file="admin_main_page.jsp" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Course  </title>
</head>
<body>

<h4><u>Delete User By ID </u></h4>

	 <form action="delete_course" method="POST">
        <pre>
        Enter user id     : <input type="number" name="course_id" /><br>
                    <input type="submit" value="Delete" /><br>
                    <a href="admin_course.jsp">Course</a>
       </pre>
     </form>

</body>
</html>