package com.kodewala.Constructorday12;

import java.util.Scanner;

public class Mobile {

    String name;
    int price;

    Mobile(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    Mobile(String name)
    {
        this(name, 0);
    }

    public static void main(String[] args)
    {
        Mobile m1 = new Mobile("Nokia");

        System.out.println("PHONE NAME : " + m1.name);
        System.out.println("PHONE price : " + m1.price);
    }
}
