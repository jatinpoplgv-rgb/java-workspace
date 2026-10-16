package Stringbuilder1;

public class Words {
	public static void main(String[] args) 
	{
		StringBuilder s = new StringBuilder("java");
		
		s.append(" Full stack");
		s.insert(0, "Learn ");
		System.out.println(s);
		
	}

}
