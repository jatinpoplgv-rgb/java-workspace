package CantrolFlow;

import java.util.Scanner;

public class Hotel {

	public void roomBooking(String customerType,int roomprice)
	{
	   if (roomprice < 3000) 
	   {
		   System.out.println("No discount for you");
	   }
	   int discount = 0;
	   int totalAmount = 0;
	   
	   switch (customerType) {
	case "GOLD":
		    discount = 20;
		    
		    discount = roomprice*discount/100;
		    
		    if (discount > 3000) 
		    {
		    	discount = 3000;
		    }
		    totalAmount = roomprice - discount;
		    System.out.println("your roomprice is : "+roomprice);
		    System.out.println("your total amount :"+totalAmount);
		break;
	case "PREMIUM":
	    discount = 10;
	    
	    discount = roomprice*discount/100;
	    totalAmount = roomprice - discount;
	    if (discount > 3000) 
	    {
	    	discount = 3000;
	    }
	    totalAmount = roomprice - discount;
	    System.out.println("your roomprice is : "+roomprice);
	    System.out.println("your total amount :"+totalAmount);
	break;
	case "REGULAR":
	    discount = 5;
	   
	    discount = roomprice*discount/100;
	   
	    if (discount > 3000) 
	    {
	    	discount = 3000;
	    }
	    totalAmount = roomprice - discount;
	    System.out.println("your roomprice is : "+roomprice);
	    System.out.println("your total amount :"+totalAmount);
	break;
	

	
	}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the usertype");
		String customerType = sc.nextLine();
		
		System.out.println("Please enter room price");
		int roomprice = sc.nextInt();
		
		
		Hotel room1 = new Hotel();
		room1.roomBooking(customerType,roomprice);
sc.close();
	}

}
