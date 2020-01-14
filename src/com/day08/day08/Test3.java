package com.day08.day08;

import com.day08.day08.til3.Cat;
import com.day08.day08.til3.Dog;

public class Test3 {
    public static void main(String[] args) {
        Dog dog=new Dog("旺财");
        dog.eat();
        dog.lookHome();
        Cat cat=new Cat("波斯猫");
        cat.eat();
        cat.catchMouse();
    }
}
