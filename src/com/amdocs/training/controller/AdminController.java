package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.implementation.AdminImpl;
import com.amdocs.training.implementation.UserImpl;
import com.amdocs.training.model.Admin;
import com.amdocs.training.model.User;

@WebServlet("/admin")
public class AdminController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("admin_id"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		Admin admin = new Admin(id, name, email, password);
		
		
		AdminDAO dao = new AdminImpl();
		
		boolean status = dao.addAdmin(admin);
		
		if(status) {
			out.println("Saved Successfully!");
		}
		else {
			out.println("try again");
		}
	}
	
	

}
