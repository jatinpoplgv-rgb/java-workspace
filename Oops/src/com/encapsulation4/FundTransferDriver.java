package com.encapsulation4;

public class FundTransferDriver {

	public static void main(String[] args) 
	{
		FundTransfer account1 = new FundTransfer("Jatin", "123456789", 5000);
		FundTransfer account2= new FundTransfer("Jatin", "123456789", 5000);
		

        account1.doDebit(1000);

        System.out.println("Account holder: " + account1.getAccountHolderName());
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Remaining balance: " + account1.getBlanace());
		
        account2.doCredit(1000);

        System.out.println("Account holder: " + account2.getAccountHolderName());
        System.out.println("Account number: " + account2.getAccountNumber());
        System.out.println("Remaining balance: " + account2.getBlanace());
        
	}

}
