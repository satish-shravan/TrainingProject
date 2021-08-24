package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.implementation.ContactImpl;
import com.amdocs.training.implementation.UserImpl;
import com.amdocs.training.model.Contact;
import com.amdocs.training.model.User;

@WebServlet("/contact")
public class ContactController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("user_id"));
		int c_id = Integer.parseInt(request.getParameter("contact_id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		long phone = Long.parseLong(request.getParameter("phone"));
		
		Contact contact = new Contact(id, c_id, name, message, email, phone);
		
		ContactDAO dao = new ContactImpl();
		
		boolean status = dao.addContact(contact);
		
		if(status) {
			out.println("Saved Successfully!");
		}
		else {
			out.println("try again");
		}
	}
	
	

}
