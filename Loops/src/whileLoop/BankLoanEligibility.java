package whileLoop;

import java.util.Scanner;

public class BankLoanEligibility {

	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Please enter your name");
	   String name  = null;
	   name = sc.nextLine();
	   System.out.println("Name is : "+name);
	   
	   System.out.println("Please enter your age");
	   int  age  = 0;
	   age = sc.nextInt();
	   System.out.println("Age is : "+age);
	   
	   System.out.println("Please enter your monthly salary");
	   int  salary  = 0;
	   salary = sc.nextInt();
	   System.out.println("your salary is : "+salary);
	   
	   System.out.println("Please enter your creditScore");
	   int  creditScore  = 0;
	   creditScore = sc.nextInt();
	   System.out.println("your creditScore is : "+creditScore);
	   
	   System.out.println("is there any loan runnig cuurently yes/no");
	   
	   String existingloan = sc.nextLine();
	   existingloan = sc.nextLine();
	   if (age < 21) 
	   {
		   System.out.println(" your age is less then 21 so you are not eligible for loan");
	   }
	   else if (salary < 30000) 
	   {
		   System.out.println(" minimum salary is required 30000 for loan ");
	   }
	   else if (creditScore < 700)
	   {
		   System.out.println(" your credit score is very low ");
	   }
	   else if (existingloan.equalsIgnoreCase("yes"))
	   {
           System.out.println("You are not eligible because you already have a loan.");
       }
	   else 
	   {
		  System.out.println("congratulation :"+name); 
		  System.out.println("You are  eligible because you have no any loan"); 
		  
	  int loanAmount;

        if (salary >= 50000) 
         {
              loanAmount = salary * 10;
          }

          else 
         {
              loanAmount = salary * 5;
         }
          System.out.println("Loan Amount : " + loanAmount);
      }

      sc.close();
  }
}