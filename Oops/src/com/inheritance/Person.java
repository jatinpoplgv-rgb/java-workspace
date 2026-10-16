package com.inheritance;

public class Person
{
  String name;
  int age;
 
  public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
  }
  public void personDetails() 
  {
	  System.out.println( name);
	  System.out.println( age);
  }
  
}
class Doctor extends Person
{
	
	String specialization;
	int fees ;
	
	public Doctor(String name, int age, String specialization, int fees) {
		
		super(name, age);
		
		this.specialization = specialization;
		this.fees = fees;
	}
	public void displayDoctor() 
	{
		System.out.println("--------Doctor Details--------");
		System.out.println( name);
	    System.out.println( age);
		System.out.println("Specialization :"+ specialization);
		System.out.println("Doctor fees :"+fees);
		
	}
}
class patient extends Person
{
	String pateintDisease;
	int roomNumber;
	public patient(String name, int age, String pateintDisease, int roomNumber) 
	{
		super(name, age);
		this.pateintDisease = pateintDisease;
		this.roomNumber = roomNumber;
	}
	public void displaypateint() 
	{
		System.out.println("--------Pateint Details-------");
		System.out.println( name);
	    System.out.println( age);
		System.out.println("Disease : "+ pateintDisease);
		System.out.println("RoomNumber : " + roomNumber);
	}
	
}