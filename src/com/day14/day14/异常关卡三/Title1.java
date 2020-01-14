package com.day14.day14.异常关卡三;

public class Title1 {
    public static void main(String[] args) {

        try {
            DebitCard cardnew =new DebitCard("amy",-9d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
