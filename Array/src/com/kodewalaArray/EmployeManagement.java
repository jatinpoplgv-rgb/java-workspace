package com.kodewalaArray;

public class EmployeManagement {

	String name ;
	String department ;
	int salary ;
	String employeId;
	
	
	public EmployeManagement (String name, String department, int salary, String employeId) {
		
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.employeId = employeId;
	}

	void display() {
	    System.out.println(name +" "+ department+" " +" " +salary +" "+ employeId);
	    
	   
	}

	public static void main(String[] args) 
	
	{
		EmployeManagement user1 = new EmployeManagement("jatin","IT",50000,"123rew");
		EmployeManagement user2 = new EmployeManagement("abhay","IT",30000,"12524ew");
		EmployeManagement user3 = new EmployeManagement("dhum","army",80000,"1256ew");

		EmployeManagement users[] = {user1,user2,user3};
		
		users[0].display();
		users[1].display();
		users[2].display();
	}

}
