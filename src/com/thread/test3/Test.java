package com.thread.test3;

public class Test {
    public static void main(String[] args) {
        Steamed steamed=new Steamed("菜包",0);
        Customer customer=new Customer(steamed);
        Product product=new Product(steamed);
        new Thread(customer,"小二").start();
        new Thread(product,"客官").start();
    }
}
