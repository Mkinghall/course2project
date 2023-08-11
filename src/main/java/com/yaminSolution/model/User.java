package com.yaminSolution.model;

import java.util.Date;

public class User {

	private String email;
	private String password;
	private String role;
	private String phoneNumber;
	private Date createAt;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", role=" + role + ", phoneNumber=" + phoneNumber
				+ ", createAt=" + createAt + "]";
	}
	
	
	


}