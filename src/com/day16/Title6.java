package com.day16;

public class Title6 {
    public static void main(String[] args) {
        invokeDirect(()->{
            System.out.println("导演拍电影");
        });
    }
    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
