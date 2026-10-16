package CantrolFlow;

public class Discount2
{
	public void discount(String customerType, int purchase)
	{
		if(purchase <= 1000) 
		{
			System.out.println("Discount not applied");
		}
        int totalAmount = 0;
		int discount1 = 0;
		
		switch (customerType) {
		case "GOLD":
			
				 discount1 = purchase*20/100;
				 totalAmount = purchase - discount1;
				 if(discount1 > 2500)
				 {
					 discount1 = 2500;
				 }
				 System.out.println("your amount : " +purchase );
				System.out.println("you have got discount of ruppes : "+discount1);
				 System.out.println("TotalAmount : " +totalAmount );
			break;
		case "SILVER":
			
				discount1 = purchase*15/100;
				totalAmount = purchase - discount1;
				if(discount1 > 2500)
				 {
					 discount1 = 2500;
				 }
				 System.out.println("your amount : " +purchase );
				System.out.println("you have got discount of ruppes : "+discount1);
				 System.out.println("TotalAmount : " +totalAmount );
			break;
		case "REGULAR":
			
				discount1 = purchase*5/100;
				totalAmount = purchase - discount1;
				if(discount1 > 2500)
				 {
					 discount1 = 2500;
				 }
				 System.out.println("your amount : " +purchase );
				System.out.println("you have got discount of ruppes : "+discount1);
				 System.out.println("TotalAmount : " +totalAmount );
			break;
		
			
		default:
			break;
		}
	}
	
}
