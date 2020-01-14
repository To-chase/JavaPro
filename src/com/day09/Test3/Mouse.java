package com.day09.Test3;

public class Mouse implements USB {
    public Mouse() {
        super();
    }

    @Override
    public void open() {
        System.out.println("鼠标开启，红灯亮");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭，红灯熄灭");
    }

    public void click(){
        System.out.println("点击");
    }
}
