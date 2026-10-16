package com.string;

public class Driver1 {

	public static void main(String[] args) 
	{
		String s1 = "Kodewala";// SCP --> 123qwe
		String s2 = new String("Academy");//one object in scp + one in heap --> 432vcx
		
		System.out.println(s1==s2);// 123qwe == 432vcx --> false
		
		String s3 = new String ("Kodewala");
		String s4 = new String ("Kodewala");
		
		System.out.println(s3 == s4);
		System.out.println(s4.equals(s3));

	}

}
