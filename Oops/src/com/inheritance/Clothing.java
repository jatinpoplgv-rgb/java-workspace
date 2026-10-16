package com.inheritance;

public class Clothing extends Product
{
 String colour ;
 String clotheType;
 public Clothing(String productName, String description, int quantity, String status, String colour, String clotheType) {
	super(productName, description, quantity, status);
	this.colour = colour;
	this.clotheType = clotheType;
 }
 
 public void viewClothing() 
 {
	 System.out.print(productName+" ");
	 System.out.print(description+" ");
	 System.out.print(quantity+" ");
	 System.out.print(status+" ");
	 System.out.print(colour+" ");
System.out.println(clotheType);
 }
}
