package com.constructor;

public class User1 
{
 String userName;
 String userId;
 String userType;
 
 public static int Liverusercount = 0;
 
 public User1(String userName, String userId, String userType) {
	super();
	this.userName = userName;
	this.userId = userId;
	this.userType = userType;
 }
 public User1( String userId, String userType) {
		super();
		
		this.userId = userId;
		this.userType = userType;
	 }
 public User1() {
	super();
 }
 
 {
	 Liverusercount =Liverusercount +1;
 }
 
}
