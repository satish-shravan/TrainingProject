package com.amdocs.training.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.database.DataSourceUtil;
import com.amdocs.training.database.DbUtil;
import com.amdocs.training.model.User;

public class UserImpl implements UserDAO {
	
	DataSource dataSource = DataSourceUtil.dataSource();
	Connection conn = null;
	
public boolean saveUser(User user) {
		
		String query = "insert into user values(?,?,?,?,?,?,?,?)";
		
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getRegDate());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getEmail());
			ps.setString(6, user.getPassword());
			ps.setLong(7, user.getPhone());
			ps.setString(8,user.getUploadPhoto());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return false;
	}

@Override
public User getUserById(int id) {
	
	String query = "select * from user where user_id="+id;
	User user = new User();
	
	
	try {
		conn = dataSource.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			user.setUserId(rs.getInt("user_id"));
			user.setAddress(rs.getString("address"));
			user.setEmail(rs.getString("email"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			user.setPhone(rs.getLong("phone"));
			user.setRegDate(rs.getString("reg_date"));
			user.setUploadPhoto(rs.getString("upload_photo"));
			return user;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}

@Override
public boolean deleteUserById(int id) {
	String query = "delete from user where user_id=?";
	
	try {
		conn = dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, id );
		ps.executeUpdate();
		return true;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return false;
}

@Override
public List<User> getAllUsers() {
	List<User> allUsers = new ArrayList<>();
	
	String query = "select * from user";
	
	try {
		conn = dataSource.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			int id = rs.getInt("user_id");
			String address = rs.getString("address");
			String email = rs.getString("email");
			String name = rs.getString("name");
			String password = rs.getString("password");
			Long phone = rs.getLong("phone");
			String reg_date = rs.getString("reg_date");
			String upload_photo = rs.getString("upload_photo");
			
			User user = new User(id, name, reg_date, address, email, password, phone, upload_photo);
			allUsers.add(user);
		}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return allUsers;
}

}

