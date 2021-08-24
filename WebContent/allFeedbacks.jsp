<%@ include file="admin_main_page.jsp" %> 
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

<h3><u>All Users Feedback</u></h3>

<table border="1">
<tr>
<td><h4><u>Feedback ID</u></h4></td>
<td><h4><u>User ID</u></h4></td>
<td><h4><u>Name</u></h4></td>
<td><h4><u>Feedback</u></h4></td>
<td><h4><u>Email</u></h4></td>



</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from feedback";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("f_id") %></td>
<td><%=resultSet.getString("user_id") %></td>
<td><%=resultSet.getString("name") %></td>
<td><%=resultSet.getString("feedback") %></td>
<td><%=resultSet.getString("email") %></td>
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