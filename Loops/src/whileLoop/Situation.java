package whileLoop;

import java.util.Scanner;

public class Situation 
{
	
public static void main(String[] args) 
{
	Scanner o1 = new Scanner(System.in);
    System.out.println("Enter your number : ");
    
    int i = o1.nextInt();
	int sum =0;
	int product =1; 
	
	while(i > 0) 
	{
		int digit = i%10;
		sum = sum + digit ;
		product = product*digit ;
		i = i/10;
	}
	System.out.println(sum);
	System.out.println(product);
	if (sum==product) 
	{
		System.out.println("somethig is valid");
	}
	
	
}
}
