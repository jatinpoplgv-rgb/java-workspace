package whileLoop;

public class Even {

	public static void main(String[] args) 
	{
		int i = 2;
		while (i <= 20) 
		{
			System.out.println(i++);
			i++;
		}
		i = 1;
		int sum = 0 ;
		while (i <= 10) 
		{
			
			sum = sum +i;
			
			i++;
		}
		System.out.println(sum);
		
		
		i = 1;
		while(i<=10) 
		{
			
			System.out.println(7*i);
			i++;
		}

		
	}

}
