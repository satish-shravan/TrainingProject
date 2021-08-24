package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.UserCourseDAO;
import com.amdocs.training.implementation.CourseImpl;
import com.amdocs.training.implementation.UserCourseImpl;
import com.amdocs.training.model.Course;
import com.amdocs.training.model.UserCourse;

@WebServlet("/enroll_course")
public class EnrollCourseController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int u_id = Integer.parseInt(request.getParameter("u_id"));
		int c_id = Integer.parseInt(request.getParameter("c_id"));
		
		
		UserCourseDAO dao = new UserCourseImpl();
		
		
		boolean status = dao.enroll(u_id, c_id);
		
		if(status) {
			out.println("Course Enrolled");
		}
		else {
			out.println("try again");
		}
		

     }
}

