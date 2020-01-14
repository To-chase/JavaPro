package com.day11.til7;

public class Test7 {
    public static void main(String[] args) {
        String str=new String();
        StringBuilder sb=new StringBuilder();
        long strStart=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
           str+=i;
        }
        long strEnd=System.currentTimeMillis();

        long sbStrart=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            sb.append(i);
        }
        long sbEnd=System.currentTimeMillis();

        System.out.println("str耗时:"+(strEnd-strStart));
        System.out.println("sb耗时:"+(sbEnd-sbStrart));

    }
}
