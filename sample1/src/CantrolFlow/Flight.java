package CantrolFlow;

import java.util.Scanner;

public class Flight {
public void flightBooking(String classType, int price) 
{
	if (price <5000)
	{
		System.out.println("no reult found");
	}
	
	int discount = 0;
	int totalcost =0;
	switch (classType) {
	case "Buisness":
		 discount = 20;
		 discount = price*discount;
		 if(discount > 4000)
		 {
			 discount = 4000;
		 }
		 totalcost = price - discount;
		 System.out.println("you price : "+price);
		 System.out.println("discount : "+discount );
		 System.out.println("your total cost : "+totalcost);
		break;
	case "Student":
		 discount = 15;
		 discount = price*discount;
		 if(discount > 4000)
		 {
			 discount = 4000;
		 }
		 totalcost = price - discount;
		 System.out.println("you price : "+price);
		 System.out.println("discount : "+discount );
		 System.out.println("your total cost : "+totalcost);
		break;
	case "Normal":
		 discount = 5;
		 discount = price*discount;
		 if(discount > 4000)
		 {
			 discount = 4000;
		 }
		 totalcost = price - discount;
		 System.out.println("you price : "+price);
		 System.out.println("discount : "+discount );
		 System.out.println("your total cost : "+totalcost);
		break;
	}
}
		
	
	public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);	
     
     System.out.println("enter you class type ");
     String classType = sc.nextLine();
     
     System.out.println("enter your amount");
     int price = sc.nextInt();
     
     Flight seat = new Flight();
     seat.flightBooking(classType,price);
     sc.close();
     
     
     for (int i = 1 ;i <= 5;i++) 
	 {
		 for  (int j = 1; j <= 5; j++) 
		 {
			 System.out.print("#");
		 }
		 System.out.println();
	 }
     
	}
	

	
}
