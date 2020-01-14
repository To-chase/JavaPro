package com.day09.Test1;

public class Bird extends Animal implements Live,Life{
//    @Override
//    public void fly() {
//
//    }
        @Override
    public void eat() {
        System.out.println("吃东西");
    }

//    @Override
//    public void fly() {
//        System.out.println("自由的飞");
//    }

    //只需要重写一次
    @Override
    public void show() {

    }
}
