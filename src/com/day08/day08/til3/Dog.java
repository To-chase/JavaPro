package com.day08.day08.til3;

public class Dog extends Animal {
    public Dog() {
    }


    public Dog(String name) {
        super(name);
    }

    public void lookHome(){
        System.out.println(name+"在看家");
    }

}
