package com.amdocs.training.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.amdocs.training.database.DataSourceUtil;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	 DataSource ds = DataSourceUtil.dataSource();
   	 Connection conn;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 boolean user_status = false;
   	 boolean admin_status_ = false;
   	
	 PrintWriter out = response.getWriter();
	 String pass = request.getParameter("password");
	 String mail = request.getParameter("email");
   	 
   	 
   	 String user_query = "select * from user where email="+" '"+mail +"'"+ "and password= "+"'"+ pass+"'";
   	 String admin_query = "select * from admin where email="+" '"+mail +"'"+ "and password= "+"'"+ pass+"'";
   	 
   	
	try {
		conn = ds.getConnection();
		Statement st = conn.createStatement();
	   	ResultSet rs_user = st.executeQuery(user_query);
	   	 
	   	 while(rs_user.next())
	   	 {
	   		 user_status = true;
	   	 }
	   	 
	   	 ResultSet rs_admin = st.executeQuery(admin_query);
	   	 
	   	 while(rs_admin.next())
	   	 {
	   		 admin_status_ = true;
	   	 }
	   	 
	   	 if(user_status)
	   	 {
	   		 System.out.println("User");
	   		 response.sendRedirect("course.jsp");
	   	 }
	   	 else if(admin_status_)
	   	 {
	   		 System.out.println("Admin");
	   		 response.sendRedirect("admin_user.jsp");
	   	 }
	   	 else
	   	 {
	   		 System.out.println("no data found");
	   		 out.println("Invalid Credentials");
	   	 }
	} catch (SQLException e) {
		e.printStackTrace();
	}
   	 
   
   	 

   	 
   	
   	 
   	 


		
	}
	
	

}
