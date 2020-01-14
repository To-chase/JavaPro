package com.day12.day12;

public class Test6 {
    public static void main(String[] args) {
        function("马云");
        function(345);
    }

    public static <E> void function(E e){
        System.out.println(e);
    }
}
