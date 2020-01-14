package com.day14.day14.异常关卡二;

public class Father {
    public void eat() throws ToothPainException{
        System.out.println("吃到一颗石头");
        new TonguePainException("牙疼");
    }

    public void drink(){
        System.out.println("喝什么都没有问题");
    }
}
