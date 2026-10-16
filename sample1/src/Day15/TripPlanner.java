package Day15;

public class TripPlanner

{
   public String suggestPlan(String src, String des,int  budget) 
  
        
   {
	   String suggestion = null;
	   if(budget < 1000)
	   {
		   suggestion =" you can go to your home";
		   System.out.println(suggestion);
	   }
	   else if (budget > 1000 && budget < 5000)
	   {
		   suggestion = "you can outside to your home";
		   System.out.println(suggestion);
	   }
	   else if(budget >= 5000 && budget <10000) 
	   {
		   suggestion = "now you can come with us for trip";
		   System.out.println(suggestion);
	   }
	   else 
	   {
		   suggestion = "you are a rich man";
		   System.out.println(suggestion);
		  
	   }
	   return suggestion;     
   }
   
}
