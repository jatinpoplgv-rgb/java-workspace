package com.encapsulation4;

public class ShoppingDriver {

	public static void main(String[] args)
	{
		Shopping s1 = new Shopping("jatin","erfv84","fairenlovely",650,8);
		s1.setShopping(50);
		System.out.println("Product name :"+s1.getcustomerName());
		System.out.println("product id :"+s1.getcustomerId());
		

	}

}
