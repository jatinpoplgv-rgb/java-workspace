package whileLoop;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int i = 4815;
		int sum =0;
		
		while(i > 0) 
		{
			int digit = i%10;
			sum = sum +digit ;
			i = i/10;
			
		}
		System.out.println(sum);
	}

}
