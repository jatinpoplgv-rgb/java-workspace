package CantrolFlow;

import java.util.Scanner;

public class Hospital
{
public void hospitalAppointment(String patientname, int patientage, String department ,String appointmentType) 
{
	if ( patientage < 5 || patientage > 80) 
	{
		System.out.println("Appointment requires special approval");
		return;
	}
int appointmentTypeFees = 0;
int departmentCharge = 0;
int Totalcharge = 0;
int discount = 0;
int finalCharge =0;

	switch (department) {
	case "CARDIOLOGY":
		appointmentTypeFees = 1000;
	
		if (appointmentType.equalsIgnoreCase("EMERGENCY")) 
		{
			departmentCharge = 500;
		
		}
		Totalcharge = appointmentTypeFees + departmentCharge;
		if (patientage > 60) 
		{
			discount = Totalcharge*10/100;
		}
		finalCharge = Totalcharge - discount;
		System.out.println("pateintname : "+patientname);
		System.out.println("Department Name : CARDIOLOGY");
		System.out.println("AppointmentType : "+appointmentType);
		System.out.println("Original charge : "+Totalcharge);
		System.out.println("Discount : "+discount );
		System.out.println("Final charge : "+finalCharge );
		break;
	
	case "ORTHOPEDIC":
		appointmentTypeFees = 700;
	
		if (appointmentType.equalsIgnoreCase("EMERGENCY")) 
		{
			departmentCharge = 500;
		
		}
		Totalcharge = appointmentTypeFees + departmentCharge;
		if (patientage > 60) 
		{
			discount = Totalcharge*10/100;
		}
		finalCharge = Totalcharge - discount;
		System.out.println("pateintname : "+patientname);
		System.out.println("Department Name : ORTHOPEDIC");
		System.out.println("AppointmentType : "+appointmentType);
		System.out.println("Original charge : "+Totalcharge);
		System.out.println("Discount : "+discount );
		System.out.println("Final charge : "+finalCharge );
		break;
	
	case "GENERAL":
		appointmentTypeFees = 700;
	
		if (appointmentType.equalsIgnoreCase("EMERGENCY")) 
		{
			departmentCharge = 500;
		
		}
		Totalcharge = appointmentTypeFees + departmentCharge;
		if (patientage > 60) 
		{
			discount = Totalcharge*10/100;
		}
		finalCharge = Totalcharge - discount;
		System.out.println("pateintname : "+patientname);
		System.out.println("Department Name : GENERAL");
		System.out.println("AppointmentType : "+appointmentType);
		System.out.println("Original charge : "+Totalcharge);
		System.out.println("Discount : "+discount );
		System.out.println("Final charge : "+finalCharge );
		break;
		
		

	default:
		break;
	}
	
}
public static void main(String args[]) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER PAITIENT NAME");
	String patientname = sc.nextLine();
	
	System.out.println("ENTER PAITIENT AGE");
	int patientage = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("ENTER DEPARTMENT NAME");
	String department = sc.nextLine();
	
	System.out.println("ENTER APPOITMENTTYPE ");
	String appointmentType = sc.nextLine();
	
	
	Hospital p1 = new Hospital();
	p1.hospitalAppointment(patientname,patientage,department,appointmentType);
	sc.close();
}
}
