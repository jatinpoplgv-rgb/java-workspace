package com.encapsulation4;

public class HospitalApointment 
{
	private String pateintName;
	private String pateintId;
	private int age;
	private int fee = 500;
	public HospitalApointment(String pateintName, String pateintId, int age, int fee)
	{
		super();
		this.pateintName = pateintName;
		this.pateintId = pateintId;
		this.age = age;
		this.fee = fee;
	}
	  public boolean setAppointment(int amount)
	    {
	        if (age < 1 || age > 100)
	        {
	            System.out.println("Invalid age");
	            return false;
	        }
	        System.out.println("Valid age");

	        if (amount <= 500)
	        {
	            System.out.println("Invalid appointment fee");
	            return false;
	        }

	        fee = amount;
	        System.out.println("Appointment booked successfully");
	        return true;
	    }
	
	
	public String getpateintName()
	{
		return pateintName;
	}
	public String getpateintId()
	{
		return pateintId;
	}
	public int  getage() 
	{
		return age;
	}
	public int getfee()
	{
		return fee;
	}
}
