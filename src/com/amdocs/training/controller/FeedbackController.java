package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.implementation.FeedbackImpl;
import com.amdocs.training.implementation.UserImpl;
import com.amdocs.training.model.Feedback;
import com.amdocs.training.model.User;

@WebServlet("/feedback")
public class FeedbackController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("user_id"));
		int f_id = Integer.parseInt(request.getParameter("f_id"));
		String name = request.getParameter("name");
		String feedback = request.getParameter("feedback");
		String email = request.getParameter("email");
		
		Feedback fb = new Feedback(id, f_id, name, feedback, email);
		
		FeedbackDAO dao = new FeedbackImpl();
		
		boolean status = dao.addFeedback(fb);
		
		if(status) {
			out.println("Saved Successfully!");
		}
		else {
			out.println("try again");
		}
	}
	
	

}
