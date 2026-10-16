package com.inheritance;

public class Employesss
{
 String employeName;
 String employeId;
 int salary;
 
 public Employesss(String employeName, String employeId, int salary) {
	
	this.employeName = employeName;
	this.employeId = employeId;
	this.salary = salary;
 }
 public void displayEmployesss() 
 {
	 System.out.println("Emolpye name :" + employeName );
	 System.out.println("Employe Id :" + employeId );
	 System.out.println("Salary :" + salary);
	 
	 System.out.println("-------------------------");
 }
 public int getSalary() 
 {
	 return salary;
 }
}
class Developer extends Employesss 
{
	String ProgrammingLanguage;

	public Developer(String employeName, String employeId, int salary, String programmingLanguage) {
		super(employeName, employeId, salary);
		ProgrammingLanguage = programmingLanguage;
	}
	public void displayDeveloper() 
	{
		System.out.println(employeName);
		 System.out.println(employeId);
		 System.out.println(salary);
		System.out.println(ProgrammingLanguage);
	}

}
class Manager1 extends Employesss
{
	String department;

	public Manager1(String employeName, String employeId, int salary, String department) {
		super(employeName, employeId, salary);
		this.department = department;
	}
public void displayMananger() 
{
	System.out.println(employeName);
	 System.out.println(employeId);
	 System.out.println(salary);
	System.out.println(department);
}	
}
