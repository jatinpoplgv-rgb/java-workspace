package ForLoops;

public class CityDriver 
{
  public static void main(String args[])
  {
	  City c1 = new City("gwalior");
	  City c2 = new City("indore");
	  City c3 = new City("goa");
	  City c4 = new City("jhansi");
	  City c5 = new City("ghumor");
	  City c6 = new City("gohad");
	  
	  
	  City citys[] = new City[6]; 
	  
	  citys[0] = c1;
	  citys[1] = c2;
	  citys[2] = c3;
	  citys[3] = c4;
	  citys[4] = c5;
	  citys[5] = c6;
	  
	  
	  for (int i = 0; i < citys.length;i++)
	  {
		  if (citys[i].name.startsWith("g"))
		  {
			  System.out.println(  "the city start from g is : " + citys[i].name  );
		  }
	  }
	  
	  
  }
}
