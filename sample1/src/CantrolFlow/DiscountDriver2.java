package CantrolFlow;

import java.util.Scanner;

public class DiscountDriver2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the customer type");
		String customerType = sc.nextLine();
		
		System.out.println("Enter the purchase amount");
		int purchase = sc.nextInt();
		
		Discount2 discounts = new Discount2();
		
		discounts.discount(customerType, purchase);
		
sc.close();
	}

}
