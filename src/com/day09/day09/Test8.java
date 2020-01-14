package com.day09.day09;

import com.day09.day09.til8.*;

public class Test8 {
    public static void main(String[] args) {
        GouWuChe buy=new GouWuChe();
        System.out.println("=============添加商品====================");
        Goods lp=new Laptop("g10000","笔记本",10000d);
        Goods phone=new Phone("g10001","手机",5000d);
        Goods fruit=new Fruit("g20000","苹果",50d);
        buy.addGoods(lp);
        buy.addGoods(phone);
        buy.addGoods(fruit);
        System.out.println("=============打印商品====================");
        buy.show();
        System.out.println("-----------------------------------------");
        buy.total();
    }
}
