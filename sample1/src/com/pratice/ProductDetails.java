package com.pratice;

public class ProductDetails {
	 {
		 Product p1 = new Product("maggi",55,"tasty",100);
		 System.out.println(p1.productName+" "+p1.price+" "+p1.descrpition+" "+p1.quaninty);
		 
		 Product p2 = new Product("maggi","tasty");
		 System.out.println(p2.productName+"  "+p2.descrpition);
		 
		 Product p3 = new Product();
		 System.out.println(p3.productName+" "+p3.price+" "+p3.descrpition+" "+p3.quaninty);
	 }

}
