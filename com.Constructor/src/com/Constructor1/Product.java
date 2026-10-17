package com.Constructor1;

public class Product 
{
	
String productName ;
String productType;
int price ;

Product (String _productName,String _productType,int _price)
{
	this.productName = _productName;
	this.productType = _productType;
	this.price = _price;
	
}
public void displayDetails()
{
	System.out.println("Product name :" +productName);
	System.out.println("Product Details :" +productType);
	System.out.println("Product Price :" +price);
}
public static void main(String args[])
{
	Product p1 = new Product("Maggie","Food",55);
	p1.displayDetails();
}
}