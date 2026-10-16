package Stringbuilder1;

public class QueryDriver {

	public static void main(String[] args) 
	{
		QueryGenerator query = new QueryGenerator();
		
		StringBuilder result = query.generateQuery(150000000, null);
		System.out.println(result);

	}

}
