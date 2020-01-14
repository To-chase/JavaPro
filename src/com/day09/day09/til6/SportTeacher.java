package com.day09.day09.til6;

public class SportTeacher extends Teacher implements Sport {

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playSport() {
        System.out.println("年龄为"+age+"岁的老师"+" "+name+" "+"在打篮球");
    }
}
