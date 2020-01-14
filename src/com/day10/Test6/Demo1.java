package com.day10.Test6;

public class Demo1 {
    public static void main(String[] args) {
      Swimable swimable=getSwimable();
      swimable.swim();
    }

    public static Swimable getSwimable() {
        SwimStudent ss = new SwimStudent();
        SwimTeacher st=new SwimTeacher();
        return st;
    }
}
