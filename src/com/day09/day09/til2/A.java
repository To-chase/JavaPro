package com.day09.day09.til2;

public interface A {
    public abstract void showA();
    public default void showB(){
        System.out.println("BBBBB");
    }
}
