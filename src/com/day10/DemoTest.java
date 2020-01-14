package com.day10;

public class DemoTest {
    public static void main(String[] args) {
//        new Fu(){
//            @Override
//            public void go() {
//                System.out.println("继承来的匿名内部类");
//            }
//        }.go();
//
//
//       Person p= new Person(){
//            @Override
//            public void eat() {
//                System.out.println("接口来的匿名内部类");
//            }
//        };
//       p.eat();
//       p.eat();
        get(()->{
            System.out.println("aaaa");
        });




    }

    public static void get(Person p){
        p.eat();
    }

    public static void gets(Fu fu){
        fu.go();
    }
}
