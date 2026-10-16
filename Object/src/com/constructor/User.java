package com.constructor;

public class User 
{
	String userName;
    String userId;
    String mobileNumber;
    
    // static block will get executed just after the class loading
    static {
    	
    	
    	System.out.println("i am in static init block");
    	
    }
	public User(String userName, String userId, String mobileNumber) {
		super();
		System.out.println("User.user(String userName, String userId, String mobileNumber).....constructor");
		this.userName = userName;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}
    
    
}
