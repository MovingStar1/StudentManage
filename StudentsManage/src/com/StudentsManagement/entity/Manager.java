package com.StudentsManagement.entity;

public class Manager {
	private int userId;
	private String userName;
	private String userPw;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	@Override
	public String toString() {
		return "Manager [userId=" + userId + ", userName=" + userName
				+ ", userPw=" + userPw + "]";
	}
	public Manager(int userId, String userName, String userPw) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPw = userPw;
	}
	
}
