package Scan;

import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		int price = 0;
		
		System.out.println("Please enter price : ");
		// before reading the integer you are going to make sure user is supplying integer
		
		if (sc.hasNextInt()) 
		{
			price = sc.nextInt();
		}
		else 
		{
			System.out.println("Please enter the right format");
		}
		System.out.println("Price :" + price);
		sc.close();
		
		
		
	}

}
