package com.day03;

public class til3 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%5==0){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("1-100之间既是三的倍数又是五的倍数之和:"+sum);
    }
}
