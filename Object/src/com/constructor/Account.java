package com.constructor;
class AccountMgmt
{
	public AccountMgmt() 
	{
		System.out.println("AccountMgmt.AccountMgmt()......");
	}
	}
public class Account extends AccountMgmt
{
 String accountNumber;
 // Instance Init Block --> executed whenever object is created 
 {
	 System.out.println("Account IIB");
 }
 public Account(String accountNumber) {
	super();
	// call to init --> IIB--> 2nd line
	System.out.println("Account(String accountNumber)");
	this.accountNumber = accountNumber;
 }
 
}
