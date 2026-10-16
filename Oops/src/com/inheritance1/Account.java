package com.inheritance1;

public class Account 

{
public void openAccount(String userId , String email)
{
	System.out.println("Account.openAccount()");
}
}
class SavingAccount extends Account
{
	@Override
	public void openAccount(String userId ,String email) 
	{
		System.out.println("SavingAccount.openAccount()");
	}
}
class SrCitAccount extends SavingAccount
{
	@Override
public void openAccount(String userId,String email) 
{
	System.out.println("srcitAccount.openAccount()");
}	
}
class PensionAccount extends SrCitAccount
{
	@Override
public void openAccount (String userId,String email) 
{
	System.out.println("PensionAccount.openAccount()");
}	
}
