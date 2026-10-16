package com.encapsulation4;

public class PaymentDriver {

	public static void main(String[] args)
	{
		Payemnt payment = new Payemnt(1000);
		
		payment.doCredit(500);
		System.out.println(payment.getBlanace());
	}

}
