package com.jwt.eaxmple.demo.model;

public class JwtUser {
	
	String userName;
	long id;
	String role;

	public void setUserName(String subject) {
		// TODO Auto-generated method stub
		this.userName = subject;
		
	}

	public String getUserName() {
		return userName;
	}

	public long getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	public void setId(long parseLong) {
		// TODO Auto-generated method stub
		this.id = parseLong;
		
	}

	public void setRole(String role) {
		// TODO Auto-generated method stub
		
		this.role = role;
		
	}

}
