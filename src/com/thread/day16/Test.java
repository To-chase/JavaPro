package com.thread.day16;

public class Test {
    public static void main(String[] args) {
        Steamed steamed=new Steamed("菜包",0,7);
        Customer customer=new Customer(steamed);
        Product product=new Product(steamed);
        new Thread(customer,"客官").start();
        new Thread(product,"小二").start();
    }
}
