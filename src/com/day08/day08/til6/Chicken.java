package com.day08.day08.til6;

public class Chicken extends  Poultry{

    public Chicken(){

    }
    public Chicken(int age, String color) {

        this.setAge(age);
        this.setColor(color);
    }
    public void eat(){
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的公鸡在啄米");
    }

    public void call(){
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的公鸡在鸣叫米");
    }
}
