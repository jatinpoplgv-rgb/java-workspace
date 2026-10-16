package com.encapsulation4;



public class BankAccount 
{
 private   int balance = 0;

 public BankAccount(int balance) {
	super();
	this.balance = balance;
 }
 // setter 
 public void setBalance (int balance) 
 {
	 if (balance >=0) 
		 
	 {
		 this.balance = balance;
		 
	 }
	
 }
 // getter
 public int getBalance() 
 {
	 return balance ;
 }
}
