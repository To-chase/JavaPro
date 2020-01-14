package com.day11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws Exception{
        Date date=new Date();
        System.out.println(date);

        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=df.format(date);
//        System.out.println(str);
        String str1="2020-01-06 11:58:07";
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1=sf.parse(str1);
        System.out.println(date1);
    }
}
