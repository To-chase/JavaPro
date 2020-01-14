package com.day10.Demo;

public class Test1 {
    public static void main(String[] args) {

        e((a)->{
            System.out.println(a+"吃喝");
        });
    }
//        e("大象",(a)->{
//            System.out.println(a+"吃吃吃");
//        });
//    }
//    public static void e(Animal animal){
//        animal.eat();
//    }

//    public static void e(String name,Animal animal){
//        animal.eat(name);
//    }

    public static void e(Animal animal){
        animal.eat("helo");
    }
}
