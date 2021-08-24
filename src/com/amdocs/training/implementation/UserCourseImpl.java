package com.amdocs.training.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.amdocs.training.dao.UserCourseDAO;
import com.amdocs.training.database.DataSourceUtil;

public class UserCourseImpl  implements UserCourseDAO{

	DataSource dataSource = DataSourceUtil.dataSource();
	@Override
	public List<Integer> display(int id) {
		// TODO Auto-generated method stub
		String display="select * from user_course where user_id="+String.valueOf(id);
        List<Integer>list=new ArrayList<>();
        try{
        	//Connection conn = DBUtils.getConn();
        	Connection conn = dataSource.getConnection();
            Statement stmt=conn.createStatement();
            ResultSet data=stmt.executeQuery(display);
            while (data.next())
            {
                int c_ID=data.getInt(2);
                list.add(c_ID);
                System.out.println("Course_ID : "+c_ID);
            }
            return list;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return list;
	}

	@Override
	public boolean delete(int u_id, int c_id) {
		// TODO Auto-generated method stub
		String query="delete from user_course where course_id=? and user_id=?";
        try{
        	Connection conn = dataSource.getConnection();
            PreparedStatement ps= conn.prepareStatement(query);
            ps.setInt(1,c_id);
            ps.setInt(2, u_id);
            ps.executeUpdate();
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean enroll(int u_id,int c_id) {
		// TODO Auto-generated method stub
		String insert = "insert into user_course values(?,?)";
        try{
        	Connection conn = dataSource.getConnection();
            PreparedStatement ps= conn.prepareStatement(insert);
            ps.setInt(2,c_id);
            ps.setInt(1,u_id);
            ps.executeUpdate();
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
		return false;
	}
}

