package com.day11.til6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) throws  Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入日期:");
        String str = sc.next();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        long date = sf.parse(str).getTime();
        Date date1 = new Date();
        long l=date1.getTime();

        long score=l-date;
        if(score>0){
            System.out.println("出生"+score/1000/60/24/60+"天");
        }else {
            System.out.println("你还没出生");
        }
    }
}
