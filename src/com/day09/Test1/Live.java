package com.day09.Test1;

public interface Live {

    public abstract void eat();
    public default void fly(){
        System.out.println("飞");
    }
    public abstract void show();
    public static void  life(){
        System.out.println("生命");
    }

}
