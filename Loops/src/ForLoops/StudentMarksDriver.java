package ForLoops;

public class StudentMarksDriver
{
  public static void main(String args[])
  {
	  StudentMarks user1 = new StudentMarks("jatin"  ,95,"789456123");
	  StudentMarks user2 = new StudentMarks("abhay"  ,86,"8412852");
	  StudentMarks user3 = new StudentMarks("dhum"   ,66,"789414443");
	  StudentMarks user4 = new StudentMarks("bhanu"  ,20,"424521523");
	  StudentMarks user5 = new StudentMarks("nishant",01,"4525456123");
	  StudentMarks user6 = new StudentMarks("akshay" ,56,"4963456123");
	  StudentMarks user7 = new StudentMarks("jay"    ,91,"255456123");
	  StudentMarks user8 = new StudentMarks("ashish" ,26,"652456123");
	  StudentMarks user9 = new StudentMarks("bihari" ,20,"654552456123");
	  StudentMarks user10 = new StudentMarks("deepak",15,"787456123");
	  
	  
	  StudentMarks Student[] = new StudentMarks[10];
	  
	  Student[0] = user1;
	  Student[1] = user2;
	  Student[2] = user3;
	  Student[3] = user4;
	  Student[4] = user5;
	  Student[5] = user6;
	  Student[6] = user7;
	  Student[7] = user8;
	  Student[8] = user9;
	  Student[9] = user10;
	  
	   for (int i = 0; i < Student.length ;i ++)
	   {
		   if (Student[i].marks < 40)
		   {
			   System.out.println(Student[i].name + " " + Student[i].marks + " " + Student[i].mobileNumber + " you have scored less marks :");
		   }
	   }
	   
	  
	  
  }
}
