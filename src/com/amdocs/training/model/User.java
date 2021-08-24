package com.amdocs.training.model;


public class User {
	
	Integer userId;
	String name;
	String regDate;
	String address;
	String email;
	String password;
	Long phone;
	String uploadPhoto;
	
	public User()
	{
		
	}
	
	public User(Integer userId, String name, String regDate, String address, String email, String password, Long phone, String uploadPhoto) {
		this.userId = userId;
		this.name = name;
		this.regDate = regDate;
		this.address = address;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.uploadPhoto = uploadPhoto;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getUploadPhoto() {
		return uploadPhoto;
	}

	public void setUploadPhoto(String uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
	}

	
	
	
	

}
