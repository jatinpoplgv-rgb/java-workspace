package Stringbuilder1;

public class Employee
{
   final String componyName = "jio";
   String employeName;
   String employeId;
   String department;
   double expericnce;
   int basicSalary;
   
   
   public Employee( String employeName, String employeId, String department, double expericnce, int  basicSalary) {
	
	
	this.employeName = employeName;
	this.employeId = employeId;
	this.department = department;
	this.expericnce = expericnce;
	this.basicSalary = basicSalary;
   }
   
   void  employedetail() 
   {
	   if  (basicSalary < 20000) 
		{
			System.out.println("sorry you have less then basic salary");
			
		}
	   if (expericnce < 1) 
	   {
		   System.out.println("your bonus is zero");
	   }
	   int bonus = 0;
	   int finalsalary = 0;
	  switch (department) {
	 
	case "IT":
		if (basicSalary > 20000 && expericnce < 2) 
		{
			bonus = basicSalary*5/100;
			finalsalary = basicSalary + bonus;
			System.out.println("STAUS : bonus eligble");
		}
		else if (basicSalary > 20000 && expericnce < 5) 
		{
			bonus = basicSalary*5/100;
			finalsalary = basicSalary + bonus;
			
		}
		
		System.out.println("Compony Name: " +componyName);
		System.out.println("Employee Id: " +employeId);
		System.out.println("Employee Name : " +employeName);
		System.out.println("Deoartment : "+department);
		System.out.println("Basic salary :"+basicSalary);
		System.out.println("experince :"+expericnce);
		System.out.println("experince :"+bonus);
		System.out.println("Final salary :"+finalsalary);
		
		
		
		break;
	case "MEC":
		if (basicSalary > 20000 && expericnce < 2) 
		{
			bonus = basicSalary*5/100;
			finalsalary = basicSalary + bonus;
		}
		else if (basicSalary > 20000 && expericnce < 5) 
		{
			bonus = basicSalary*5/100;
			finalsalary = basicSalary + bonus;
		}
		StringBuilder sb = new StringBuilder();

		sb.append("Employee Name: ").append(employeName).append("\n");
		sb.append("Employee ID: ").append(employeId).append("\n");
		sb.append("Department: ").append(department).append("\n");
		sb.append("Basic Salary: ").append(basicSalary).append("\n");
		System.out.println("experince :"+expericnce);
		System.out.println("bonu :"+bonus);
		System.out.println("Final salary :"+finalsalary);
		System.out.println(sb);
		
		break;
		

	
	} 
   }
   
   public static void main(String[] args) 
   {
	   Employee e1 = new Employee("jatin","fg85","MEC",2.5,25000);
	   e1.employedetail();
	   
	System.out.println(e1);
}
   
}
