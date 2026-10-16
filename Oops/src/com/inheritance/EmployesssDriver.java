package com.inheritance;

public class EmployesssDriver {

	public static void main(String[] args)
	{
		Developer user1 = new Developer("ABHAY", "TYH120", 5000, "HTML");
		Manager1 user2 = new Manager1("JATIN", "EDDF5", 1500000, "JAVA FULLSTACK");
		Developer user3 = new Developer("BHANU", "DDC120", 5000, "LUND");
		Manager1 user4 = new Manager1("DHUMKETU", "CDDF5", 1500000, "JAVA FULLSTACK");
     
		Employesss users [] = {user1,user2,user3,user4};
		
		for(Employesss a : users )
		{
			if (a.getSalary() > 40000)
			{
				a.displayEmployesss();
			}
		}
		
		
		
	}

}
