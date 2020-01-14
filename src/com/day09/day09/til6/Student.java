package com.day09.day09.til6;

public class Student extends Person {

    public Student(String name,int age) {
        this.name=name;
        this.age=age;
    }
    @Override
    public void eat() {
        System.out.println("学生餐");
    }
}
