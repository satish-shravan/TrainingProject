package com.amdocs.training.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.database.DataSourceUtil;
import com.amdocs.training.database.DbUtil;
import com.amdocs.training.model.Admin;

public class AdminImpl implements AdminDAO{

	DataSource dataSource = DataSourceUtil.dataSource();
	
	public boolean addAdmin(Admin admin) {
		
		String query  = "insert into admin values(?,?,?,?)";
		
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, admin.getAdminId());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getEmail());
			ps.setString(4,admin.getPassword());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
