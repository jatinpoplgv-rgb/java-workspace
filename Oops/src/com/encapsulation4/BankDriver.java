package com.encapsulation4;

public class BankDriver {

	public static void main(String[] args) {
		Bank account = new Bank();

		account.setBalance(8000);
		account.setBalance(2000);
		account.setBalance(15000);
		account.setBalance(3000);

		System.out.println(account.getBalance());

		
	}

}
