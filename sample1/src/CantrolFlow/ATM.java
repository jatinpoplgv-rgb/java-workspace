package CantrolFlow;

import java.util.Scanner;

public class ATM {

	public void ATMWithdrawl(String accountType,int accountBalance,int withdrawalAmount)
	{
		if (withdrawalAmount < 0 ) 
		{
		System.out.println("please enter ammount");
		return;
		}
		if (withdrawalAmount % 500 != 0  ) 
		{
			System.out.println("valid withdrawl");
			return;
		}
		
		int remaningBalance = 0;
		
		switch (accountType) {
		
		case "Saving":
			
			if (withdrawalAmount > 20000)
			{
				System.out.println("only 20000 can be withrawl");
				System.out.println("do not deduct anything");
				return;
			}
			remaningBalance = accountBalance - withdrawalAmount;
			if (remaningBalance < 1000)
			{
				System.out.println("please maintain the account balance");
				return;
			}
			System.out.println("Withdrawal Amount "+withdrawalAmount);
			System.out.println("remaning Blance :"+remaningBalance);
			break;
			
		case "Current":
			
			if (withdrawalAmount > 50000)
			{
				System.out.println("only 50000 can be withrawl");
				System.out.println("do not deduct anything");
				return;
			}
			remaningBalance = accountBalance - withdrawalAmount;
			if (remaningBalance < 1000)
			{
				System.out.println("please maintain the account balance");
				return;
			}
			System.out.println("Withdrawal Amount "+withdrawalAmount);
			System.out.println("remaning Blance :"+remaningBalance);
			break;
		default:
			break;
		}
	}
	
	
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);	
    
	    System.out.println("Enter your Account Type");
	    String accountType = sc.nextLine();
	    
	    System.out.println("Enter your Account balance");
	    int accountBalance = sc.nextInt();
	    
	    System.out.println("Enter your withdrawal");
	    int withdrawalAmount = sc.nextInt();
	    
	    ATM obj = new ATM();
	    obj.ATMWithdrawl(accountType,accountBalance,withdrawalAmount);
	    sc.close();
	}

}
