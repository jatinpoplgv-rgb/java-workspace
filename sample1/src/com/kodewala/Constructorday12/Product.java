package com.kodewala.Constructorday12;

public class Product 
{

	String productName;
	int productPrice;
	String productId;
	int productQunantity;
	
	
	public Product(String productName, int productPrice, String productId, int productQunantity)
	{
		
		this.productName = productName;
		this.productPrice = productPrice;
		this.productId = productId;
		this.productQunantity = productQunantity;	
		
	}


	public Product() 
	{
		productName = "unknown";
		productPrice = 0;
		productId = "unknown";
		productQunantity = 0;
		
	}
	
	
	
		void displayProduct() {

	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + productPrice); 
	        System.out.println("Product ID: " + productId);
	        System.out.println("Quantity: " + productQunantity);
		
	}
	
	
	
	
}
