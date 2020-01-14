package com.day10.com.til4;

public class Apple {
    private int sizeApple;
    private String color;

    public Apple(int sizeApple, String color) {
        this.sizeApple = sizeApple;
        this.color = color;
    }

    public int getSizeApple() {
        return sizeApple;
    }

    public void setSizeApple(int sizeApple) {
        this.sizeApple = sizeApple;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return sizeApple+"-"+color;
    }
}
