package com.day09.day09.til6;

public class Teacher extends Person {

    public Teacher(String name,int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public void eat() {
        System.out.println("工作餐");
    }
}
