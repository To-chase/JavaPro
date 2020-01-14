package com.day10;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("oooo");
        System.out.println(sum(12, 4, (a, b) -> {
            return a + b;
        }));
    }

    public static int sum(int a, int b, Sum sum) {
        return a + b;
    }
}
