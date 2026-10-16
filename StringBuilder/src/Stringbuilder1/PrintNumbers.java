package Stringbuilder1;

public class PrintNumbers
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0;i<=10;i++)
		{
			
			if (i % 2 == 0)
		    {
		        sb.append(" even ").append(i).append(";");
		    }
		
		}
		System.out.println(sb);
	
		sb.setLength(0);
		for (int i = 0;i<=10;i++)
		{
			
			if (i % 2 != 0)
		    {
		        sb.append(" oddd ").append(i).append(";");
		    }
		
		}
		System.out.println(sb);
	}
	
}
