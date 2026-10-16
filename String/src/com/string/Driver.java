package com.string;

public class Driver {

	public static void main(String[] args)
	{
		// create a string object
		String firstName = "jatin"; // obj created in scp --> first name --> xyz122
		String lastName = "jatin";// object with content "jatin" already created
                                  // and lastName will reger to existing object
		                          // lastname is also pointing to address xyz122
		
		// string city = new string ()
		System.out.println(firstName == lastName); // == will compare the address of an object
	}

}
