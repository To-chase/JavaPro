package com.day11.til8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test8 {
    public static void main(String[] args) throws  Exception {
//        String str="2016-12-18";
//        Date date=new Date("2016-12-18");
//        System.out.println(date);
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        sf.applyPattern("yyyy年MM月dd日");
//        Date date=sf.parse(str);
        Date date=new Date();
       String str= sf.format(date);
        System.out.println(str);

//        System.out.println(str);
    }
}
