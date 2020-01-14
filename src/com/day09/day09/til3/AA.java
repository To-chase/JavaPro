package com.day09.day09.til3;

public interface AA {
    public abstract void showA();
    public static void showTime(String str){
        for(int i=0;i<10;i++){
            System.out.print(str+" ");
        }
    }

    public default void showB(){
         showTime("BBBB");
    }

    public  default void showC(){
        showTime("CCCC");
    }
}
