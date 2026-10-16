package com.inheritance;

public class SavingAccount extends Account
{
public void openSavingAccount(String name ,String address , String type) 
{
	//reusing the existing functionalites
	openBankAccount(name,address,type);
}
}
