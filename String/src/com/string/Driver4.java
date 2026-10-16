package com.string;

public class Driver4 {

	public static void main(String[] args)
	{
		String s1 = " This " + " is from " + "Kodewala Academy Banglore"; 
		// String = This is from Kodewala Academy Banglore
		System.out.println(s1);
		
		String s2 = "Kodewala";// SCP 
		String s3 = "Academy";// SCP
		String s8 = "KodewalaAcademy";
		
		String s4 = s2 + s3 ;// heap --> new StringBuulder

		System.out.println(s8==s4.intern());
		
		String s5 = "jatin" + "singh " + "chauhan"; 
		
		String s6 = "jatin singh chauhan";
		
		System.out.println(s5==s6);
	}

}
