package com.blocks;

public class BankAccountDriver {

	public static void main(String[] args)
	{
		BankAccount user1 = new BankAccount("rahul","currrent");
		BankAccount user2 = new BankAccount("priya");
		BankAccount user3 = new BankAccount("amit","saving");
        
		
		BankAccount users[] = {user1,user2,user3};
		
		
		for (int i = 0; i < users.length; i++) {
		    System.out.println("Account holder name :" + users[i].accountHolderName);
		    System.out.println( "Account type :"+ users[i].accountType);
		   
		   
		}
		 System.out.println("Total accounts: " + BankAccount.totalAccount);
	}

}
