package whileLoop;

import java.util.Scanner;

public class OnlineShopping 
{
 public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Please enter your name ");
	 String customerName = null;
	 customerName = sc.nextLine();
	 System.out.println("Customer Name  :"+customerName);
	 
	 System.out.println("Please enter your age ");
	 int age = 0;
	 age = sc.nextInt();
	 System.out.println("Customer age  :"+age);
	 
	 sc.nextLine();
	 System.out.println("Please enter product name ");
	 String productName = null;
	 productName = sc.nextLine();
	 System.out.println("Product Name  :"+productName);
	 
	 System.out.println("Please enter price  ");
	 int price = 0;
	 price = sc.nextInt();
	 System.out.println("product price  :"+price);
	 
	 sc.nextLine();
	 System.out.println("you have a membership ? yes/no ");
	 String membership  ;
	 membership = sc.nextLine();
	 int deleiverycharges = 0;
	 
	 if (membership.equalsIgnoreCase("yes")) 
	 {
		 deleiverycharges = 0;
		 System.out.println(" deleiverycharges :"+deleiverycharges);
	 }
	 else 
		 
	 {
		 deleiverycharges = 100;
		
		 System.out.println(" deleiverycharges :"+deleiverycharges);
	 }
     
	 System.out.println("Existing pending payment — yes/no");
	 String pending = null;
	 pending = sc.nextLine();
	 if (age < 18)
	 {
		 System.out.println("your are not eligible for online shopping");
	 }	 
	 else if  (price < 500)
	 {
		 System.out.println("minimun product price is 500");
	 }
	 else if (pending.equalsIgnoreCase("no")) 
	 {
		 System.out.println("congrats :"+ customerName);
		 System.out.println(" you can get a product :");
		 
		 int totalPrice = 0;
		 totalPrice = price + deleiverycharges;
		 System.out.println("Total price "+totalPrice);
	 }
	 else if (pending.equalsIgnoreCase("yes"))
	 {
		 System.out.println(" sorry you have already an exisiting prnding payement");
	 }
	 
	 sc.close();
 }
}
