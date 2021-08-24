package com.amdocs.training.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.database.DataSourceUtil;
import com.amdocs.training.database.DbUtil;
import com.amdocs.training.model.Contact;

public class ContactImpl implements ContactDAO {

	DataSource dataSource = DataSourceUtil.dataSource();
	
	
	@Override
	public boolean addContact(Contact contact) {
		
		String query = "insert into contact values(?,?,?,?,?,?)";
		
		try {

			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, contact.getUserId());
			ps.setInt(2, contact.getContactId());
			ps.setString(3, contact.getName());
			ps.setString(4, contact.getMessage());
			ps.setString(5, contact.getEmail());
			ps.setLong(6, contact.getPhone());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
