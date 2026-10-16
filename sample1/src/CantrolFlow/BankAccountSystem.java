package CantrolFlow;

import java.util.Scanner;

public class BankAccountSystem {
	
	String accountNumber;
	String customerName;
	String accountType;
	int accountBalance;

	
	
	public BankAccountSystem(String accountNumber, String customerName, String accountType, int accountBalance) {
		
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

public void displayBalance(String accountNumber,String customerName,String accountType,int accountBalance) 
{
	
	switch (accountType) {
	case "Saving":
		if (accountBalance < 1000) 
		{
			System.out.println("LOW BALANCE");
		}
		else if (accountBalance > 1000) 
		{
			System.out.println("Acive account");
		}
		System.out.println("Customer Name :"+customerName);
		System.out.println("AccountType :"+accountType);
		System.out.println("AccountBalance :"+accountBalance);
		break;

	case "Current":
		if (accountBalance < 1000) 
		{
			System.out.println("LOW BALANCE");
		}
		else if (accountBalance > 1000) 
		{
			System.out.println("Acive account");
		}
		System.out.println("Customer Name :"+customerName);
		System.out.println("AccountType :"+accountType);
		System.out.println("AccountBalance :"+accountBalance);
		break;
	default:
		break;
	}
}

	public static void main(String[] args) 
	{
		BankAccountSystem user1 = new BankAccountSystem("7894561","jatin singh","Saving",250000);
		BankAccountSystem user2 = new BankAccountSystem("7684561","abhay singh","Saving",4500000);
		BankAccountSystem user3 = new BankAccountSystem("7854123","bhanu singh","Saving",500000);
		
		BankAccountSystem users[] = {user1,user2,user3};
		
		for (int i = 0;i < users.length;i++) 
		{
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name ");
		String customerName = sc.nextLine();
		
		System.out.println("enter your account number");
		String accountNumber = sc.nextLine();
		
		System.out.println("enter you account type");
		String accountType = sc.nextLine();
		
		System.out.println("enter your  account balance");
		int balance = sc.nextInt();
		
		BankAccountSystem u1 = new BankAccountSystem(accountNumber,customerName,accountType,balance);
		u1.displayBalance(accountNumber,customerName,accountType,balance);
		sc.close();
		
	}

}
