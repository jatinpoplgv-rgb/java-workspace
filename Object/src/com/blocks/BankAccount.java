package com.blocks;

public class BankAccount
{
 String accountHolderName;
 String accountType;
 static int totalAccount = 0;
 
 static 
 {
      System.out.println("Bank Account is Started");	 
 }
 
 public BankAccount(String accountHolderName) 
 {
	
	this.accountHolderName = accountHolderName;
	this.accountType = "Saving";
}

 public BankAccount(String accountHolderName, String accountType) 
 {
	
	this.accountHolderName = accountHolderName;
	this.accountType = accountType;
 }
 {
	 totalAccount = totalAccount+1; 
 }
 
 
}
