package com.pratice;

public class StudentDetail 
{

	String name;
	int age;
	String section;
	int marks;
	
	StudentDetail(String _name,int _age,String _section,int _marks)
	{
		System.out.println("inside StudentDetail (String _name,int _age,String _section,int _marks)");
		this.name =_name;
		this.age =_age;
		this.section =_section;
		this.marks =_marks;		
		
	}
	
}
   