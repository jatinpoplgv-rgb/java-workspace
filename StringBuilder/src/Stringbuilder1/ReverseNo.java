package Stringbuilder1;

public class ReverseNo {

	public static void main(String[] args) 
	{
		int n = 1234;
		String text = String.valueOf(n);
		String reverseNo = new StringBuilder(text).reverse().toString();
		int rev = Integer.parseInt(reverseNo);
		System.out.println(rev);

	}

}
