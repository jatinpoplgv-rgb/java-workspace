package CantrolFlow;

public class Driver2 
{
  public static void main (String args[]) 
  {
	 Driver2 driver = new Driver2();
	 
	 int day = Integer.parseInt(args[0]);
	 driver.identifyDat(day);
	  
  }
  
  public void identifyDat(int number) 
  {
	  switch (number) {
	case 1:
	
		System.out.println("Mon");
		
		break;
	case 2:
	
		System.out.println("TUE");
		
		break;
	case 3:
	
		System.out.println("WED");
		
		break;
	case 4:
	
		System.out.println("TH");
		
		break;
	case 5:
	
		System.out.println("FR");
		
		break;
	case 6:
	
		System.out.println("SAT");
		
		break;
	case 7:
	
		System.out.println("SUN");
		
		break;
	default:
	
		System.out.println("please enter the right input [1-7]");
	
		break;
	}
  }
}
