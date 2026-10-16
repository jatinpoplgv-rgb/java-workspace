package com.encapsulation4;

public class Payemnt 
{
private int balance ;

public Payemnt(int balance) {
	super();
	this.balance = balance;
}
//setter
public void doCredit(int _amount)
{
	//modifying the data
	if (_amount > 0) {
	balance = balance + _amount;
	}
	
}
public void doDebit(int _amount) 
{
	//modifying the data
	balance = balance - _amount;
	
}
public int getBlanace()
{
	return balance;
	}
}
