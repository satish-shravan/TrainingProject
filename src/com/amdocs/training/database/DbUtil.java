package com.amdocs.training.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	static String dbUrl = "jdbc:mysql://localhost:3306/amdocs_project";
	static String username = "root";
	static String password = "root";
	
	private DbUtil() {
		
	}
	
	private static Connection conn = null;
	
	public static Connection getConnection()
	{
		if(conn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(dbUrl, username, password);
				return conn;
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
		}
		return null;
	}
	
	

}
