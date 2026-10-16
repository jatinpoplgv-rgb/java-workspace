package com.inheritance;

public class ProductDriver {

	public static void main(String[] args)
	{
		Product p1 = new Product ("Google pixel 9 ","this is fantastic phone  ", 5 ,"Avaliable");
		p1.viewProductDetails();
		
		ElectronicProduct e1 =  new ElectronicProduct("Google pixel 9  ","this is fantastic phone ",5,"Avaliable",true,5);
		e1.viewElectronicProduct();
		
		Clothing c1 = new Clothing("Kurti","this is a fantstaic Kurti",8,"Available","red","cotton"); 
		c1.viewClothing();
	}

}
