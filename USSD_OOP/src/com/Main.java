package com;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args){
		List<User> u = new ArrayList<User>();
		User user1 = new User("Mark", "123",1000);
		User user2 = new User("Tom", "111",2000);
		User user3 = new User("Jack", "000",3000);
		
		u.add(user1);
		u.add(user2);
		u.add(user3);
		
		MainMenu menu = new MainMenu(u);
		menu.start();
		

	}

}
