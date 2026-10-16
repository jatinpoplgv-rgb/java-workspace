package com.kodewala.Constructorday12;

public class ProductDriverClass
{	 

		    public  static void main(String[] args) {

		        Cart cart = new Cart();

		        Product p1 = new Product("Laptop", 50000, "P101", 1);

		        Product p2 = new Product();

		        cart.addProduct(p1);

		        cart.addProduct(p2);
		    }
		
 
}
