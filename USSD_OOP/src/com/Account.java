package com;

public abstract class Account {
	
	protected double balance;

	
	public Account()
	{
		
	}
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(User user, double amount)
	{
		user.setBalance(user.getBalance() + amount);
	}
	
	public void withdraw(User user, double amount)
	{
		user.setBalance(user.getBalance() - amount);
	}
	
	public void transfer(User current, User user,double amount)
	{
		//double newAmount = user.getBalance();
		//newAmount = newAmount + amount;
		user.setBalance(user.getBalance() + amount);
		current.setBalance(current.getBalance() - amount);	
	}
	
	
	

}
