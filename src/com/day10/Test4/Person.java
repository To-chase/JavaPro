package com.day10.Test4;

public class Person {

    private String name="amy";

    public void eat(){
        class Cook{
            private int time;
            public void use(){
                System.out.println("time:"+time+"name:"+name);
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public Cook(int time) {
                this.time = time;
            }
        }
        Cook cook=new Cook(30);
        cook.use();
    }
}
