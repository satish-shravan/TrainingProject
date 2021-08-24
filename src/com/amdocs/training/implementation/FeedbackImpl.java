package com.amdocs.training.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.database.DataSourceUtil;
import com.amdocs.training.database.DbUtil;
import com.amdocs.training.model.Feedback;

public class FeedbackImpl implements FeedbackDAO{

	DataSource dataSource = DataSourceUtil.dataSource();
	
	
	@Override
	public boolean addFeedback(Feedback feedback) {
		
		String query = "insert into feedback values(?,?,?,?,?)";
		
		try {
	
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, feedback.getFeedbackId());
			ps.setInt(2, feedback.getUserId());
			ps.setString(3, feedback.getName());
			ps.setString(4, feedback.getFeedback());
			ps.setString(5, feedback.getEmail());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
