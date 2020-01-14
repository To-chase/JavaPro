package com.day09.Test1;

public interface Life {
    public abstract void show();
    public default void fly(){
        System.out.println("飞行");
    };
}
