package Day14;

class Prinicpal extends Object 
{
	
	Prinicpal()
	{
	 super();	
		
	}
}
  class PrinicpalCabin extends Prinicpal
{
	
	int noOfTeachers;
	int noOfStudent;
	int noOfWorkes;
	
	PrinicpalCabin(int _noOfTeachers,int _noOfStudent,int _noOfWorkes)
	{
		super( );
		this.noOfTeachers = _noOfTeachers;
		this.noOfStudent = _noOfStudent;
		this.noOfWorkes = _noOfWorkes;
		
	}
	
	PrinicpalCabin()
	{
		System.out.println("no arguments");
	}
 
	
    public static void main(String args[])
    
    {
	{
		PrinicpalCabin p1 = new PrinicpalCabin(50,5000,25);
		System.out.println(p1.noOfTeachers+" , "+p1.noOfStudent+" , "+p1.noOfWorkes);
		

	 }
    }
}