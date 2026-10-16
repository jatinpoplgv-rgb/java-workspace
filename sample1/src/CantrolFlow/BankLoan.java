package CantrolFlow;

import java.util.Scanner;

public class BankLoan {

	public void displayDetail(String customerName , int salary , int creditScore , boolean existingCustomer)
	{
		int intrestRate = 0;
		
		
				
		if (creditScore < 600 ) 
		{
			System.out.println(" Loan rejecetd  ");
			return;
		}
		else if ( creditScore <= 699 || salary > 30000 ) 
			
		{
			System.out.println("Loan is approved");
			if (existingCustomer == true) 
			{
				intrestRate = 9;
				
						
			}
			else 
			{
				intrestRate = 7;
			}
			
			System.out.println("customerName :"+customerName);
			System.out.println("customerSalary  :"+salary);
			System.out.println("intrest rate  :"+intrestRate+"%");
			
		}
         else if ( creditScore >= 699 || salary > 25000 ) 
			
		{
			System.out.println("Loan is approved");
			if (existingCustomer == true) 
			{
				intrestRate = 9;
				
						
			}
			else 
			{
				intrestRate = 7;
			}
			
			System.out.println("customerName :"+customerName);
			System.out.println("customerSalary  :"+salary);
			System.out.println("intrest rate  :"+intrestRate+"%");
			
		}
		
		
		
	}
	

	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your name ");
		String customerName = sc.nextLine();
		
		System.out.println("enter your salary");
		int salary = sc.nextInt();
		
		System.out.println("enter your credit score ");
		int creditScore = sc.nextInt();
		
		System.out.println("are you existingCustomer");
        boolean existingCustomer = sc.nextBoolean();
        
        BankLoan u1 = new BankLoan();
        u1.displayDetail(customerName,salary,creditScore,existingCustomer);
        sc.close();
	}

}
