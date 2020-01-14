package com.day09.day09.til6;

public class SportStudent extends Student implements Sport {

    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playSport() {
        System.out.println("年龄为"+age+"岁的学生"+" "+name+" "+"在打篮球");
    }
}
