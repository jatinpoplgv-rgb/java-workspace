package com.encapsulation4;

public class Bank {

    private int balance = 5000;

    public void setBalance(int amount) {
        if (amount > 0 && amount <= 10000) {
            balance = amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public int getBalance() {
        return balance;
    }
}
