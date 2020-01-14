package com.day10.Test3;

public class Body {
    public boolean flag=true;
    private int num=30;
    class Heart{
        private int num=20;
        public void jump(){
            int num=10;

            System.out.println(Body.this.num);
            System.out.println(this.num);
            System.out.println(num);
//            if(flag){
//                System.out.println("心脏在跳动");
//            }else {
//                System.out.println("心脏停止了");
//            }

        }
    }
}
