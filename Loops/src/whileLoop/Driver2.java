package whileLoop;

import java.util.Scanner;

public class Driver2
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  int luckyNumber = 13;
	  int userEntered = 0;
	  
	  while (luckyNumber != userEntered) 
	  {
		  System.out.println("please enter the number ....");
		  userEntered = sc.nextInt();
		  if (luckyNumber == userEntered)
		  {
			  System.out.println(" you won ......");
		  }
		  else 
		  {
			  System.err.println("Please try again...");
		  }
		  sc.close();
	  }
  }
}
