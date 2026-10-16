package CantrolFlow;

import java.util.Scanner;

public class HotelBooking 
{
    int roomNumber;
    String roomType;
    String customerName;
    
    int pricePerNight;
    
    
	
	
	
	public HotelBooking(int roomNumber, String roomType, String customerName,  int pricePerNight) {
		
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.customerName = customerName;
		
		this.pricePerNight = pricePerNight;
	}

	public void roomBooking(int roomNumber, String roomType, String customerName,  int pricePerNight)
	{
		if (pricePerNight < 2000) 
		{
			System.out.println("no result found");
			return;
		}
		int discount= 0;
		int finalPrice= 0;
		switch (roomType) {
		case "Delux":
			
			
			if (pricePerNight > 10000)
			{
				discount = pricePerNight*10/100;
				
			}
			finalPrice = pricePerNight - discount;
			if (discount > 2500) 
			{
				discount = 2500;
			}
			finalPrice = pricePerNight - discount;
			if (finalPrice > 11000)
			{
				System.out.println("Congrats you are highest booking customer");
			}
			
			System.out.println("your roomtype :"+ customerName );
			System.out.println("your roomtype :"+roomType);
			System.out.println("room no :"+roomNumber);
			System.out.println("Booking amount :"+pricePerNight);
			System.out.println("Dicount :"+discount);
			System.out.println("Final amount :"+finalPrice);
			break;
          
		    case "Priemum":
			if (pricePerNight > 10000)
			{
				discount = pricePerNight*15/100;
				
			}
			finalPrice = pricePerNight - discount;
			if (discount > 2500) 
			{
				discount = 2500;
			}
			finalPrice = pricePerNight - discount;
			if (finalPrice > 11000)
			{
				System.out.println("Congrats you are highest booking customer");
			}
			System.out.println("your roomtype :"+ customerName );
			System.out.println("your roomtype :"+roomType);
			System.out.println("room no :"+roomNumber);
			System.out.println("Booking amount :"+pricePerNight);
			System.out.println("Dicount :"+discount);
			System.out.println("Final amount :"+finalPrice);
			break;
      case "Regular":
	
	
	if (pricePerNight > 10000)
	{
		discount = pricePerNight*2/100;
		
	}
	finalPrice = pricePerNight - discount;
	if (discount > 2500) 
	{
		discount = 2500;
	}
	finalPrice = pricePerNight - discount;
	if (finalPrice > 11000)
	{
		System.out.println("Congrats you are highest booking customer");
	}
	
	System.out.println("your roomtype :"+ customerName );
	System.out.println("your roomtype :"+roomType);
	System.out.println("room no :"+roomNumber);
	System.out.println("Booking amount :"+pricePerNight);
	System.out.println("Dicount :"+discount);
	System.out.println("Final amount :"+finalPrice);
	break;


		default:
			
			break;
		}
		
	}




	public static void main(String[] args)
    {
        

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your room no :");
		int roomNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("ENTER YOUR NAME");
		String customerName = sc.nextLine();
		
		
		System.out.println("Enter your room type :");
		String roomType = sc.nextLine();
		
		
		System.out.println("Enter your booking amount");
		int pricePerNight = sc.nextInt();
		
		
		
		
		HotelBooking r1 = new HotelBooking(roomNumber,roomType,customerName,pricePerNight);
		r1.roomBooking(roomNumber, roomType, customerName, pricePerNight);
		sc.close();
	}

}
