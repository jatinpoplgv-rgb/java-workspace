package com.constructor;

public class Driver {

	public static void main(String[] args) 
	{
		System.out.println("Driver.main () START");
        User u1 = new User("jatin ","85dfdf","78968912301");
        User u2 = new User("abhay ","525dfdf","98768912301");
       
        System.out.println(u1.userName +" "+u1.mobileNumber+" "+u1.mobileNumber);
        System.out.println(u2.userName +" "+u2.mobileNumber+" "+u2.mobileNumber);
        
        System.out.println("Driver.main () END");
	}

}
