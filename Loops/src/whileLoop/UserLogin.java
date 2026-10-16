package whileLoop;

import java.util.Scanner;

public class UserLogin
{
  public static void main (String args [])
  {
	  
	 Scanner sc = new Scanner(System.in);
	 
	 int userPassword = 5462;
	 int userInput = 0;
	 
	 while (userPassword !=userInput)
	 {
		 System.out.println("Please enter your login password");
		 userInput = sc.nextInt();
		 
		 if (userPassword == userInput)
		 {
			 System.out.println("thanku for login");
			 
		 }
		 else 
		 {
			 System.err.println("Please try again");
		 }
		 
	 }
	 sc.close();
	 
	  
	  
	  
  }
}
