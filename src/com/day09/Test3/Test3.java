package com.day09.Test3;

public class Test3 {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.run();
        USB usb=new Mouse();
        l.useUsb(usb);
        USB usb1=new KeyBoard();
        l.useUsb(usb1);
        l.down();
    }
}
