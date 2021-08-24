package com.amdocs.training.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.database.DataSourceUtil;
import com.amdocs.training.database.DbUtil;
import com.amdocs.training.model.Course;

public class CourseImpl implements CourseDAO {

	DataSource dataSource = DataSourceUtil.dataSource();
	Connection conn =null;
	
	
	@Override
	public boolean addCourse(Course course) {
		
		String query = "insert into course values(?,?,?,?,?)";
		
		try {
		    conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, course.getCourseId());
			ps.setString(2, course.getCourseName());
			ps.setString(3, course.getCourseDesc());
			ps.setDouble(4, course.getCourseFee());
			ps.setString(5, course.getCourseResource());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public boolean deleteCourseById(int course_id) {
		String query = "delete from course where course_id=?";
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1,course_id);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
