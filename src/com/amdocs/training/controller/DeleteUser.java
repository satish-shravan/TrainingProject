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

@WebServlet("/delete_user")
public class DeleteUser extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("user_id"));

		UserDAO dao = new UserImpl();
			
		boolean status = dao.deleteUserById(id);
		
		if(status) {
			out.println("Deleted Successfully!");
		}
		else {
			out.println("try again");
		}
	}
}