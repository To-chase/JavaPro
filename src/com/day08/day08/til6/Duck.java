package com.day08.day08.til6;


public class Duck extends Poultry{

    public Duck(){

    }

    public Duck(int age, String color) {
        this.setAge(age);
        this.setColor(color);
    }


    public void eat(){
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的鸭子在吃饭");
    }

    public void swim(){
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的鸭子在游泳");
    }

}
