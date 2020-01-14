package com.day08;

public class Coder extends People {
    int num=20;
    public void keock(){
        System.out.println("敲代码");
    }

    public void print(){
        System.out.println("父类:"+num);
        System.out.println("子类:"+num);
    }
}
