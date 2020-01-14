package com.day09.Test3;

public class Laptop {

    public void run(){
        System.out.println("运行");
    }

    public void useUsb(USB usb){
        usb.open();
        if (usb instanceof Mouse) {
            Mouse m=(Mouse)usb;
            m.open();
            m.click();
            m.close();
        }else if(usb instanceof  KeyBoard){
            KeyBoard k=new KeyBoard();
            k.open();
            k.key();
            k.close();
        }
        usb.close();
    }

    public void down(){
        System.out.println("停止运行，关机");
    }
}
