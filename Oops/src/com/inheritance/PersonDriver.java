package com.inheritance;

public class PersonDriver {

	public static void main(String[] args)
	{
		Doctor d1 = new Doctor ("jatin",25,"NeuroSurgen",500);
		d1.displayDoctor();
        
		patient p1 = new patient("Abhay", 21, "Piles", 104);
		p1.displaypateint();
	}

}
