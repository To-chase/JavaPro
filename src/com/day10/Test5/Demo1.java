package com.day10.Test5;

public class Demo1 {

    public static void main(String[] args) {
        new Swim(){
            public void swimming(){
                System.out.println("狗爬式");
            }
            public void run(){
                System.out.println("跑步");
            }
        }.run();

        goSwiming(new Swim(){
            public void swimming(){
                System.out.println(">>>狗爬式");
            }
            public void run(){
                System.out.println("跑步");
            }
        } );

    Swim swim=new Swim(){
        @Override
        public void swimming() {
            System.out.println("自由泳");
        }
        public void run(){
            System.out.println("慢跑");
        }
    };
//    swim.swimming();
        goSwiming(swim);
//    swim.run();

    }

    public static void goSwiming(Swim s){
       s.swimming();
    }

}

 interface Swim{
    void swimming();
}

class Person implements Swim{
    @Override
    public void swimming() {
        System.out.println("蝶泳");
    }
}
