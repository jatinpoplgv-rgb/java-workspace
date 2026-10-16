package com.inheritance;

public class Product
{
 String productName;
 String description;
 int quantity;
 String status;
 public Product(String productName, String description, int quantity, String status) {
	super();
	this.productName = productName;
	this.description = description;
	this.quantity = quantity;
	this.status = status;
 }
 
 public void viewProductDetails() 
 {
	 System.out.print(productName+" ");
	 System.out.print(description+" ");
	 System.out.print(quantity+" ");
	 System.out.println(status+" ");
 }
}
