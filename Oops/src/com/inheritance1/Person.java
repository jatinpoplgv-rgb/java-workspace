package com.inheritance1;

public class Person
{
  String name;
  int age;
 
  public Person(String name, int age)
  {
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
	
	
	int fees ;
	
	public Doctor(String name, int age,  int fees) {
		
		super(name, age);	
		this.fees = fees;
	}
	public void displayDoctor() 
	{
		System.out.println("--------Doctor Details--------");
		System.out.println("Dr.Name : "+ name);
	    System.out.println( "Age " + age);	
		System.out.println("Doctor fees :"+fees);
		
	}
}
class Surgen extends Doctor 
{
	String specializationation ;

	public Surgen(String name, int age, int fees, String specializationation) {
		super(name, age, fees);
		this.specializationation = specializationation;
	}
	public void displaySurgen() 
	{
		System.out.println("--------Doctor Details--------");
		System.out.println("Dr.Name : "+ name);
	    System.out.println( "Age " + age);	
	    System.out.println(specializationation + " Specialist");
	    System.out.println("Doctor fees :"+fees);
		
	}
}
class Patient extends Person
{
	String pateintDisease;
	int roomNumber;
	public Patient(String name, int age, String pateintDisease, int roomNumber) 
	{
		super(name, age);
		this.pateintDisease = pateintDisease;
		this.roomNumber = roomNumber;
	}
	public void displayPateint() 
	{
		System.out.println("--------Pateint Details-------");
		System.out.println("Patient Name : "+ name);
	    System.out.println("Age " + age);
		System.out.println("Disease : "+ pateintDisease);
		System.out.println("RoomNumber : " + roomNumber);
	}
	
}