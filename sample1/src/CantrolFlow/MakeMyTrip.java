package CantrolFlow;

public class MakeMyTrip
{
    public String bookingTrip(String name, String place, int fare)
    {
        String suggestion;
        int  calculated = 0;
        if(fare < 5000)
        	
        	
        {
            calculated = fare*0;
            suggestion = "No discount is applied";
            System.out.println("Sorry sir: " + suggestion + "off :" +calculated);
        }
        
        
        else if(fare >= 5000 && fare < 10000)
        {
        	calculated = fare*10/100;
            suggestion = "10% discount is applied";
            System.out.println("Congrats: " + suggestion + "off :"+ calculated);
        }
        
        
        else if(fare > 10000 && fare < 12000)
        {
        	calculated = fare*15/100;
            suggestion = "15% discount is applied";
            System.out.println("Congrats: " + suggestion + "off :" + calculated );
        }
        else 
        {
        	suggestion = "2000 dsicount is max ";
        	System.out.println("Congrats: " + suggestion  );
        }

        return suggestion;
        
    }
    
}