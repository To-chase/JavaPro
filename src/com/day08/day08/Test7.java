package com.day08.day08;

import com.day08.day08.til7.Cooker;
import com.day08.day08.til7.Manager;

public class Test7 {
    public static void main(String[] args) {
        Manager m=new Manager("m110","老王",10000.0);
        m.eat();
        m.world();
        Cooker c=new Cooker("c110","小王",6000.0);
        c.eat();
        c.world();
    }
}
