package Day15;

public class FlightBooking
{
 public String bookingFlight(String destination , int age , int budget) 
 {
	 String comment = null;
	 
	// free discount
	 if (age < 5)
	 {
		comment = "you have recived full discount";
		System.out.println(" congrats :" + comment );
		 
	 }
	 else if (age >= 18 && budget >= 2000 && budget < 5000)
	 {
		comment = "you have recived 10% discount";
		System.out.println(" congrats :" + comment );
		 
	 }
	 else if (age >= 18 && budget < 8000 )
	 {
		comment = "you have recived 15% discount";
		System.out.println(" congrats :" + comment );
		 
	 }
	 else if (budget > 10000) 
	 {
		comment = "Max discount is only up to 2000 ";
		System.out.println(" congrats :" + comment );
	 }
	 return comment;
	 
 }

}
