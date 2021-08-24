package com.amdocs.training.model;


public class Contact {
	
	Integer userId;
	Integer contactId;
	String name;
	String message;
	String email;
	Long phone;
	
	public Contact(){
		
	}

	public Contact(Integer userId, Integer contactId, String name, String message, String email, Long phone) {
		this.userId = userId;
		this.contactId = contactId;
		this.name = name;
		this.message = message;
		this.email = email;
		this.phone = phone;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
	
	
	

}
