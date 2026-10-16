package Scan;

import java.util.Scanner;

public class Driver3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your name");
		String customerName = sc.nextLine();
		
		System.out.println(" Enter your Foodname");
		String foodName = sc.nextLine();
		
		
	
        int price = 0;
		
		System.out.println("Please enter price : ");
		// before reading the integer you are going to make sure user is supplying integer
		
		if (sc.hasNextInt()) 
		{
			price = sc.nextInt();
		}
		else 
		{
			System.err.println("Please enter the right format");
		}
		
		sc.nextLine();
		
		System.out.println(" Deleiver address");
		String address = sc.nextLine();
		
		
		System.out.println(customerName);
		System.out.println(foodName);
		System.out.println(price);
		System.out.println(address);
		
		sc.close();
		

	}

}
