package whileLoop;

public class count {

	public static void main(String[] args) 
	{
		int i = 482599681;
		int count = 0;
		while (i > 0)
		{
		    i = i / 10;     // remove the last digit
		    count++;        // count one digit
		}
		System.out.println("Digits : " + count);   // outside

}
}