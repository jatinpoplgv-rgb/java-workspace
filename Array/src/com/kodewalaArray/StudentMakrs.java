package com.kodewalaArray;

public class StudentMakrs {

	String name;
	String course;
	int marks ;
	int age;
	
	
	
	
	public StudentMakrs(String name, String course, int marks, int age) {
		
		this.name = name;
		this.course = course;
		this.marks = marks;
		this.age = age;
	}

      


	public static void main(String[] args) 
	{
		StudentMakrs s1 = new StudentMakrs("arjun","java",78,21);
		StudentMakrs s2 = new StudentMakrs("rahul","python",92,23);
		StudentMakrs s3 = new StudentMakrs("vikram","sql",66,20);
		StudentMakrs s4 = new StudentMakrs("jatin","java",88,24);
		
		StudentMakrs students[] = {s1,s2,s3,s4};
		
		for (int i = 0; i < students.length; i++) 
		{
			if (students[i].marks > 60) 
			{
				
			}
			System.out.println(students[i].name + " , " +students[i].course+" , "+students[i].marks+" , "+students[i].age);
		}
		int highestMarks = 0;
         for (int i = 0; i < students.length; i++)
         {
        	 if (students[i].marks > highestMarks) 
        	 {
        		 highestMarks = students[i].marks;
        	
        	 }
        	 
         }
         System.out.println("highest marks : "+highestMarks);
         
         int lowestMarks = 0;
         for (int i = 0; i < students.length; i++)
         {
        	 if (students[i].marks > lowestMarks) 
        	 {
        		 lowestMarks = students[i].marks;
        	 }
        	 
        	  
         }
         System.out.println("lowest price : "+lowestMarks);
         
         
         StudentMakrs oldest = students[0];          // start with the first student

         for (int i = 0; i < students.length; i++)
         {
             if (students[i].age > oldest.age)
             {
                 oldest = students[i];               // save the whole student
             }
         }

         System.out.println("Oldest student is : " + oldest.name + " , " + oldest.age);   // outside
         StudentMakrs youngestStudent = students[0];
         for (int i = 0; i < students.length; i++) 
         {
        	 if (students[i].age < youngestStudent.age &&  students[i].age >0) 
        	 {
        		 youngestStudent = students[i];
        	 }
        	 
         }
         System.out.println("Youngest student is : "+youngestStudent.name+" , "+youngestStudent.age);
         int totalMarks = 0;
         
         for (int i = 0; i < students.length; i++) 
         {
        	 totalMarks = totalMarks + students[i].marks;
         }
         System.out.println("total students marks :"+totalMarks);
         int javaCount = 0;
         for (int i = 0; i < students.length; i++)
         {
             if (students[i].course.equalsIgnoreCase("java"))
             {
                 javaCount++;
             }
         }
         System.out.println("Students in Java course : " + javaCount);
        
         int totalStudent = 0;
         for (int i = 0; i < students.length; i++)
         {
        	 totalStudent++;
         }
         System.out.println("total no of students :"+totalStudent);
         
         int aveageMarks = 0;
         
         aveageMarks = totalMarks /totalStudent;
         System.out.println("average students marks :"+aveageMarks);
        
	}
	

}
