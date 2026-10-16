package com.inheritance;

public class BankAccountDriver {

	public static void main(String[] args) 
	{
		SavingsAccount account = new SavingsAccount("Rahul", "12345", 50000, 5);
		SavingsAccount account1 = new SavingsAccount("jatin", "12345", 522000, 8);
		
		account.calculateIntrestRate();
		account1.calculateIntrestRate();
		 
	}

}
