package com.blocks;

public class Demo {

static int x = 2;

static {
    System.out.println("A");
    x = x + 3;
}

{
    System.out.println("B");
    x = x + 2;
}

Demo() {
    System.out.println("C");
}

}













