package com.day06;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int num=random.nextInt(100)+1;
        int i=0;
        while(i<3){
                System.out.println("你还有"+(3-i)+"次机会猜数字");
                int num1=sc.nextInt();
                if(num1>num){
                    System.out.println("猜大了");
                }else if(num1<num){
                    System.out.println("猜小了");
                }else{
                    System.out.println("猜对了了");
                    break;
                }
                  i++;

        }
        System.out.println("答案是:"+num);

    }
}
