package com.day08.day08.til3;

public class Animal {
    String name;
    String color;
    String price;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name+"在吃饭");
    }
}
