package com.day08.day08;


import com.day08.day08.til6.Chicken;
import com.day08.day08.til6.Duck;

public class Test6 {
    public static void main(String[] args) {
        Chicken c=new Chicken(1,"红色");
        c.call();
        c.eat();
        Duck d=new Duck(2,"黑色");
        d.eat();
        d.swim();

    }
}
