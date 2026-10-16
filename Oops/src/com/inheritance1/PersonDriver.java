package com.inheritance1;



public class PersonDriver {

	public static void main(String[] args)
	{
		Surgen d1 = new Surgen ("jatin",25,500,"NeuroSurgen");
		d1.displaySurgen();
        
		Patient p1 = new Patient("Abhay", 21, "Piles", 104);
		p1.displayPateint();
		Patient p2 = new Patient("Dhusyant", 24, "Scabies", 104);
		p2.displayPateint();
		
	}

}

