package com.amdocs.training.dao;

import com.amdocs.training.model.Course;

public interface CourseDAO {
	
	boolean addCourse(Course course);
	
	boolean deleteCourseByName(String courseName);

}
