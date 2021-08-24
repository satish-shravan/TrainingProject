package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.implementation.UserImpl;
import com.amdocs.training.model.User;

@WebServlet("/user_register")
public class UserController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("user_id"));
		String name = request.getParameter("name");
		String reg_date = request.getParameter("reg_date");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String photo = request.getParameter("upload_photo");
		long phone = Long.parseLong(request.getParameter("phone"));
		
		User user = new User(id, name, reg_date, address, email, password, phone, photo);
		
		System.out.println(id+" "+ name);
		
		UserDAO dao = new UserImpl();
			
		boolean status = dao.saveUser(user);
		
		if(status) {
			out.println("Saved Successfully!");
			out.print(dao.getUserById(id).getName());
			response.sendRedirect("login.jsp");
		}
		else {
			out.println("try again");
		}
		
	
	}
	

	
	
	

}
