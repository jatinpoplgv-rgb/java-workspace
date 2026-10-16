package Nesting;

public class Understanding2 {

	public static void main(String[] args) 
	{
		for (int row = 1; row <= 4; row++)
		{
		    // inner loop 1: print spaces
		    for (int sp = 1; sp <= 4 -row; sp++)     // blank 1
		    {
		        System.out.print(" ");
		    }

		    // inner loop 2: print stars
		    for (int st = 1; st <= row; st++)     // blank 2
		    {
		        System.out.print("*");
		    }

		    System.out.println();
		}

	}

}
