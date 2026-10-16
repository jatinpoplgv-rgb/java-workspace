package com.string;

public class Driver3 {

	public static void main(String[] args) 
	{
		String s = "Kodewala";
		// in case i want to change s
		
		String s2 = s.concat("Academy");// trying to change the object
		                                // object created in heap with content Kodewala Academy
		System.out.println(s2);

		String a = "Jatin";
		a = "babu";
		System.out.println(a);
	}

}
