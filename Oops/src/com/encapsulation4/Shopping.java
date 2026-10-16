package com.encapsulation4;

public class Shopping 
{
	String customerName ;
	String customerId;
	String productName;
	private  int productPrice;
	int quantity;
	
	
	public Shopping(String customerName, String customerId, String productName, int productPrice, int quantity) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
	}
	
	public void setShopping(  int amount) 
	{
		int totalPrice = 0;
		if (amount  >= 500 && quantity >= 5) 
		{
			productPrice = amount;
			totalPrice = productPrice*quantity;
			System.out.println("Total Price :"+totalPrice);
		}
		else 
		{
		 System.out.println("invalid ");
		}
	}
	
public String getcustomerName () 
{
	return customerName;
}
public String getcustomerId() 
{
	return customerId;
}

}
