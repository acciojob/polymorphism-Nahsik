package com.driver;

public class Main {

    public static void main(String[] arg) {
        Product p = new Product();
        System.out.println(p.product(2, 3));
        System.out.println(p.product(2, 3, 4));
        System.out.println(p.product((double) 2, (double) 3));
    }
}
