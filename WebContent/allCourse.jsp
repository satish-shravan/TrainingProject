
<%@page import="java.sql.*"%>

<%
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "amdocs_project";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>
<h3><u>All Course</u></h3>
<table border="1">
<tr>
<td><h4><u>Course ID</u></h4></td>
<td><h4><u>Name</u></h4></td>
<td><h4><u>Description</u></h4></td>
<td><h4><u>Fees</u></h4></td>
<td><h4><u>Resource</u></h4></td>


</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from course";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("course_id") %></td>
<td><%=resultSet.getString("c_name") %></td>
<td><%=resultSet.getString("c_desc") %></td>
<td><%=resultSet.getString("c_fee") %></td>
<td><%=resultSet.getString("c_res") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>