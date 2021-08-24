package com.amdocs.training.model;

public class Feedback {
	
	Integer userId;
	Integer feedbackId;
	String name;
	String feedback;
	String email;

	public Feedback() {
		
	}

	public Feedback(Integer userId, Integer feedbackId, String name, String feedback, String email) {
		this.userId = userId;
		this.feedbackId = feedbackId;
		this.name = name;
		this.feedback = feedback;
		this.email = email;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	

}
