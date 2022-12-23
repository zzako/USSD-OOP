package com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
	
	Scanner myObj = new Scanner(System.in);
	List<User> users = new ArrayList<User>();
	String u;
	String p;
	User currentUser;
	

    public MainMenu(List<User> u)
    {
    	this.users = u;
    }
	
	public void start()
	{
		System.out.println("Welcome to SA Banking App");
		System.out.println("1)Login \n2)Register");
		int start = myObj.nextInt();
		if(start == 1) {
		login();
		}
		else if(start == 2) {
		register();
		}
		else
		{
			System.out.println("Please select one or two");
		}
	}
	
	public void login()
	{
		 System.out.print("Please enter username: ");
		 String username = myObj.next();
		 System.out.print("Please enter password: ");
		 String password = myObj.next();
		 
		 u = username;
		 p = password;
		 
		for(User u : users)
		{			
			if(username.equals(u.getUsername()) && password.equals(u.getPassword()))
			{			
			
//				System.out.println("succ");	
				//System.out.println(u.getBalance());
				currentUser = u;
				options(u);		
			    break;
			}		
		} 	 
	}
	
	
	public void register()
	{
		System.out.println("Login");
	}
	
	public void options(User user) {
		int i = 0;
		while(i <= 10)
		{
		System.out.println("Balance: R" + user.getBalance()+" \n1)Deposit \n2)Withdraw \n3)Transfer \n4)Exit");
		int input = myObj.nextInt();
		for(User u : users)
		{
		if(input == 1) {
			System.out.println("Enter Amount:");
			int inputA = myObj.nextInt();
			user.deposit(currentUser, inputA);
			break;
			}
			else if(input == 2) {
				System.out.println("Enter Amount:");
				int inputA = myObj.nextInt();
				user.withdraw(currentUser,inputA);
				break;
			}
			else if(input == 3)
			{
				System.out.println("Enter users name");
				String name = myObj.next();
				User local = null;
				for(User y : users)
				{
					if(y.getUsername().equals(name))
                    {
	                        local = y;
	                        break;
                    }
				}
				System.out.println("Enter Amount:");
				int inputA = myObj.nextInt();
				user.transfer(currentUser, local, inputA);
				break;
			}
			else if(input == 3)
			{
				System.out.println("Bye...");
				System.exit(0);
				break;
			}
			else
			{
				System.out.println("Please select one or two");
			}
		}
		}
}
}
