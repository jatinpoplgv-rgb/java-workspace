package com.pratice;

public class Product {

	String productName;
	int price;
	String descrpition;
	int quaninty;
	
	
	Product(String _productName,int _price,String _descrpition,int _quaninty)
	{
		this.productName = _productName;
		this.price = _price;
		this.descrpition = _descrpition;
		this.quaninty = _quaninty;
		
	}
	
	
	Product(String _productName,String _descrpition)
	{
		this.productName = _productName;
		this.descrpition = _descrpition;
		
	}
	
	Product()
	{
		System.out.println("information");
	}
}

  class ProductDetail
 
 {
	 public static void main(String args[])
	 
	 {
		 Product p1 = new Product("maggi",55,"tasty",100);
		 System.out.println(p1.productName+" "+p1.price+" "+p1.descrpition+" "+p1.quaninty);
		 
		 Product p2 = new Product("maggi","tasty");
		 System.out.println(p2.productName+"  "+p2.descrpition);
		 
		 Product p3 = new Product();
		 System.out.println(p3.productName+" "+p3.price+" "+p3.descrpition+" "+p3.quaninty);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }