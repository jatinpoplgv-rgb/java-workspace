package com.inheritance;

public class BankAccount 
{
  String accountHolderName;
  String accountNumber;
  int balance;
  
  
  public BankAccount(String accountHolderName, String accountNumber, int balance)
  {
	super();
	this.accountHolderName = accountHolderName;
	this.accountNumber = accountNumber;
	this.balance = balance;
	
  }
  public void displayDetails() 
  {
	  System.out.println("Account Holder Name : " + accountHolderName);
	  System.out.println("Account Number : " + accountNumber );
	  System.out.println("Balance : " + balance );
	  System.out.println("-------------------------------");
  }
}
class SavingsAccount extends BankAccount
{
     int intrestRate;

	 public SavingsAccount(String accountHolderName, String accountNumber, int balance, int intrestRate) 
	 {
		super(accountHolderName, accountNumber, balance);
		this.intrestRate = intrestRate;
	 }
	 public void calculateIntrestRate () 
	 {
		 
		 int  intrest = balance*intrestRate/100;
		  System.out.println("Account Holder Name : " + accountHolderName);
		  System.out.println("Account Number : " + accountNumber );
		  System.out.println("Balance : " + balance );
		  System.out.println("Total Interst : " + intrest);
		  System.out.println("-------------------------------");
		 
	 }
     
     
}
