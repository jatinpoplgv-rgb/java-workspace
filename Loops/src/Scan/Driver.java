package Scan;

import java.util.Scanner;

public class Driver 
{
  public static void main(String args[])
  {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please enter the name");
	  String name = sc.nextLine();
	  
	  System.out.println("please enter product price ...");
	  
	  int price = sc.nextInt();
	  
	  sc.nextLine();
	  
	  System.out.println("Pls enter delievery address");
	  
	  String address = sc.nextLine();
	  
	  System.out.println("Name is :"+ name);
	  System.out.println("Price is :"+ price);
	  System.out.println("Address is :"+ address);
	  
	  sc.close();
	  
  }
}
