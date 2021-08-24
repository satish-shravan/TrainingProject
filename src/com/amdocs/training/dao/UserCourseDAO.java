package com.amdocs.training.dao;

import java.util.List;

public interface UserCourseDAO {
	
	List<Integer> display(int user_id);
	boolean delete(int u_id,int c_id);
	boolean enroll(int u_id,int c_id);

	

}
