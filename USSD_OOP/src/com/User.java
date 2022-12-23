package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends Account{

	
	private String username;
	private String password;
	private int Age;
	private User user;

	

	public User getUser() {
		return user;		
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public User(String username, String password, double amount) {
		super(amount);
		this.username = username;
		this.password = password;		
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;		
	}
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
