package com.day08.day08.til3;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public void catchMouse(){
        System.out.println(name+"在捉老鼠");
    }
}
