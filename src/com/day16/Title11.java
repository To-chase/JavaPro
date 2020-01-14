package com.day16;

public class Title11 {
    public static void main(String[] args) {
//        String str=DoubleColorBallUtil.create();
//        System.out.println(str);
        Runnable runnable=new Runnable() {
            private Integer num=100;
            @Override
            public void run() {
                while(true){
                    if(num<=0){
                        break;
                    }
                    synchronized (this){
                        String str=DoubleColorBallUtil.create();
//                        System.out.println(Thread.currentThread().getName()+":"+num+",号码为:"+str);
                        System.out.println("编号为:"+num+"的员工从"+Thread.currentThread().getName()+" 入场！ 拿到的双色号码为:"+str);
                        num--;
                    }
                }
            }
        };
        Thread thread=new Thread(runnable,"后门");
        Thread thread1=new Thread(runnable,"前门");
        thread.start();
        thread1.start();
    }
}
