package com.day09.Test3;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘开启，绿灯开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭，绿灯熄灭");
    }

    public void key(){
        System.out.println("按键盘");
    }
}
