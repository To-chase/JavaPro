package com.day08;

public class Chiled extends Fu {
     String name;
    static {
        System.out.println("我是子类的静态代码块");//2
    }
    public Chiled(){
        System.out.println("我是子类的无参构造函数");//4
    }
    {
        System.out.println("子");
    }

    public Chiled(String name){
        this();
        System.out.println("我是子类的有参构造函数");
    }
//    public void eat(){
//        System.out.println("子类的eat");
//    }
//
//    public void menthod(){
//        super.eat();
//        this.eat();
//    }
}
