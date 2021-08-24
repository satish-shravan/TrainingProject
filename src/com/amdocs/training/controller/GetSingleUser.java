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

@WebServlet("/get_user")
public class GetSingleUser extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		
		System.out.println("id" + id);

		UserDAO dao = new UserImpl();
			
		User user = dao.getUserById(id);
		
		if(user != null)
		{
			
			out.println("\nId  : " + user.getUserId()+" | ");
			out.println("\nReg. Date : "+user.getRegDate() + " | ");
			out.println("\nName : " +user.getName()+" | ");
			out.println("\nAddress: " +user.getAddress()+" | ");
			out.println("\nEmail: " +user.getEmail()+" | ");
			out.println("\nPassword: " +user.getPassword()+" | ");
			out.println("\nPhone: " +user.getPhone()+" | ");
			out.println("\nPhoto:" +user.getUploadPhoto()+" | ");
			
		}
		else
		{
			System.out.println("Error ");
		}
	}
}