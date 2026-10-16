package com.inheritance;

public class ElectronicProduct extends Product
{
	boolean isWarranty;
int warrantyInYears;
public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarranty,
		int warrantyInYears) {
	super(productName, description, quantity, status);
	this.isWarranty = isWarranty;
	this.warrantyInYears = warrantyInYears;
}

public void viewElectronicProduct() 
{
	System.out.print(productName+" ");
	 System.out.print(description+" ");
	 System.out.print(quantity+" ");
	 System.out.print(status+" ");
	 System.out.print(isWarranty+" ");
	 System.out.println(warrantyInYears+"");
}
}
