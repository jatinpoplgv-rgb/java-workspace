package com.kodewalaArray;

public class AccountDriver {

	public static void main(String[] args) 
	
	{
		Account user1 = new Account("jatin","current",78952);
		Account user2 = new Account("abhay","saving",7862);
		Account user3 = new Account("dhum","current",78412);
		Account user4 = new Account("bhanu","saving",78522);
		Account user5 = new Account("shiva","current",74552);
		
		
		Account users[] = new Account[5]; 
		
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		users[4] = user5;
		
		System.out.println(user1);
		
	}

}
