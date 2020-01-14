package com.day10.com.til4;

public interface CompareAble {
    default Apple compare(Apple a1, Apple a2){
        return a1.getSizeApple()>a2.getSizeApple()?a1:a2;
    }
}
