package com.encapsulation4;

public class BankAccountDriver {

	public static void main(String[] args) 
	{
		BankAccount user1 = new BankAccount(5000);
		
		user1.setBalance(2500);
		System.out.println(user1.getBalance());
BankAccount user2 = new BankAccount(5000);
		
		user2.setBalance(-6000);
		System.out.println(user2.getBalance());

	}

}
