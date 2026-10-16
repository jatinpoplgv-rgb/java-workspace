package com.inheritance;

public class Employee {

	String name = "Jatin";
	String address = "Banglore";
	private String empCode = "ICR522";
	
	public void marksIn(String empID) 
	{
		System.out.println("Marking IN  :"+ empID);
	}
}
class Manager extends Employee
{
	public void doSomething () 
	{
		
		System.out.println(name);
		System.out.println(address);
		marksIn(address);
		marksIn(name);
		
		
		
	}
}