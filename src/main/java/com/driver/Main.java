package com.driver;

public class Main {

    public static void main(String[] arg) {
        Product product = new Product();
        System.out.println(product.product(2, 3));
        System.out.println(product.product(2, 3, 4));
        System.out.println(product.product((double) 2, (double) 3));
    }
}

class Product {
    public int product(int x, int y) {
        return x * y;
    }

    public int product(int x, int y, int z) {
        return x * y * z;
    }

    public double product(double x, double y) {
        return x * y;
    }

}
