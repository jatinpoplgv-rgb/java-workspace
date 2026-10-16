package Scan;

import java.util.Scanner;

public class AmazonPrime {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String customerName = sc.nextLine();
		
		System.out.println("Please enter your product name");
		String productName = sc.nextLine();
		
		
		System.out.println("please enter product price");   
		int price = sc.nextInt();
		
		
		System.out.println("are you prime user ? true/false");
		boolean prime = sc.nextBoolean();
		
		int delieveryCharges ;
		
		if(prime) 
		{
			delieveryCharges = 0;
		}
		else 
		{
			delieveryCharges = 100;
		}
		 int totalPrice = price + delieveryCharges;
		
		System.out.println("your delievery caharges :"+delieveryCharges);
		System.out.println( "name is : "+customerName);
		System.out.println("product name is :"+productName);
		System.out.println("price is :"+price);
		System.out.println("memebership :"+prime);
		System.out.println("your total price is "+totalPrice);
		
		sc.close();
	}

}
