package com.inheritance1;

public class ShoppingBill
{
String customerName;
String productName;
int price;
int quantity;
int discount;

ShoppingBill(String customerName,String productName,int price,int quantity,int discount)
{
	this.customerName = customerName;
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
	this.discount = discount;
	
}
public void displayDetails()
{
	System.out.println("=========================");
	System.out.println("CUSTOMER NAME : "+customerName );
	System.out.println("PRODUCT NAME : "+productName );
	System.out.println("PRODUCT PRICE : "+price );
	System.out.println("PRODUCT QUANTITY : "+quantity );
	
}

public void calculateBill()
{
	int totalPrice = price*quantity;
	int maxDiscount = 1000;
	if (totalPrice < 1000)
	{
		discount = 0;
		int discountamount = totalPrice*discount/100;
		if (discountamount > 1000) 
		{
			discountamount = maxDiscount;
		}
		totalPrice = totalPrice - discountamount;
		System.out.println("=========================");
		System.out.println("Discount amount :"+discountamount);
		System.out.println("Discount :"+totalPrice);
		System.out.println("Total price :"+totalPrice);
	}
	else if (totalPrice < 4999)
	{
		discount = 5;
		int discountamount = totalPrice*discount/100;
		if (discountamount > 1000) 
		{
			discountamount = maxDiscount;
		}
		totalPrice = totalPrice - discountamount;
		System.out.println("=========================");
		System.out.println("Discount amount:"+discountamount);
		System.out.println("Discount :"+totalPrice);
		System.out.println("Total price :"+totalPrice);
	}
	else if (totalPrice < 9999)
	{
		discount = 10;
		int discountamount = totalPrice*discount/100;
		if (discountamount > 1000) 
		{
			discountamount = maxDiscount;
		}
		totalPrice = totalPrice - discountamount;
		System.out.println("=========================");
		System.out.println("Discount amount:"+discountamount);
		System.out.println("Discount :"+totalPrice);
		System.out.println("Total price :"+totalPrice);
	}
	else  
	{
		discount = 12;
		
		int discountamount = totalPrice*discount/100;
		if (discountamount > 1000) 
		{
			discountamount = maxDiscount;
		}
		totalPrice = totalPrice - discountamount;
		System.out.println("=========================");
		System.out.println("Discount amount :"+discountamount);
		System.out.println("Discount :"+totalPrice);
		System.out.println("Total price :"+totalPrice);
	}
}
public static void main(String args[])
{
	ShoppingBill user1 = new ShoppingBill("Jatin","Maggie",10000,1,0);
	user1.displayDetails();
	user1.calculateBill();
}
}