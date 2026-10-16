package com.encapsulation4;

public class FundTransfer 
{
String accountHolderName;
String accountNumber;
 int balance ;
 int amount;


public FundTransfer(String accountHolderName, String accountNumber, int balance) {
	super();
	this.accountHolderName = accountHolderName;
	this.accountNumber = accountNumber;
	this.balance = balance;
	
}

public void doDebit (int amount) 
{
if  (amount > 0 && amount <= balance ) 
{
 System.out.println("transcation is allowed");	
 balance = balance - amount;
}
}

public void doCredit (int amount) 
{
if  (amount > 0 && amount <= balance ) 
{
 System.out.println("transcation is allowed");	
 balance = balance + amount;
}

}
public int getBlanace()
{
	return balance;
}
public String getAccountHolderName() 
{
    return accountHolderName;
}
public String getAccountNumber() 
{
	return accountNumber;
}
}
