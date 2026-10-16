package Day15;

public class FoodOrder 
{
  public String orderMeal(int amount)
  {
	  String comment = null;
	  if (amount > 100 && amount < 300) 
	  { 
		  comment = "you can order small meal";
	     System.out.println(comment);
	  }
	  
	  else if (amount > 300 && amount < 1000)  
	  { 
		  comment = "you can order medium meal";
	       System.out.println(comment);
	  }
	  
	  else if (amount > 1000 && amount < 2000)  
	  { 
		  comment = "you can order large meal";
	       System.out.println(comment);
	  }
	  else   
	  { 
		  comment = "you can order perimum meal";
	       System.out.println(comment);
	  }
	  return comment;
  }
}
