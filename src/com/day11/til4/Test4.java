package com.day11.til4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws Exception{
        String str="1992-10-20";
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sf.parse(str);
        System.out.println(date);
    }
}
