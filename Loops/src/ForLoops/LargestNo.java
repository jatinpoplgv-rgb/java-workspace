package ForLoops;

public class LargestNo 
{
public static void main(String[] args) 
{
	int i = 7894561;
    int highestNo = 0;
	while (i>0) 
	{
		int digit = i%10;
	    if (digit > highestNo) 
	    {
	    	highestNo = digit ;
	    	
	    }
		
	    i = i/10;
		
	}
	System.out.println(highestNo);
}
}
