package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.implementation.CourseImpl;
import com.amdocs.training.implementation.UserImpl;
import com.amdocs.training.model.Course;
import com.amdocs.training.model.User;

@WebServlet("/course")
public class CourseController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("c_id"));
		String c_name = request.getParameter("c_name");
		String c_desc = request.getParameter("desc");
		Double c_fee = Double.parseDouble(request.getParameter("c_fee"));
		String c_res = request.getParameter("c_res");
		
	
		Course course = new Course(id, c_name, c_desc, c_fee, c_res);
		
		CourseDAO dao = new CourseImpl();
		
		
		boolean status = dao.addCourse(course);
		
		if(status) {
			out.println("Saved Successfully!");
		}
		else {
			out.println("try again");
		}
	}
	
	

}
