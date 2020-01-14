package com.day08.redenvelope;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        GroupManager groupManager=new GroupManager("amy",300d);

        double money=90;
        if(money<groupManager.getLeftMoney()){
            ArrayList<Double> list=groupManager.fa(money,3);
            groupManager.show();
            Members members=new Members("lulu",20d);
            Members members1=new Members("lili",50d);
            Members members2=new Members("张三",80d);
//            members.show();
//            members1.show();
//            members2.show();
            members.closed(list);
            members1.closed(list);
            members2.closed(list);
            members.show();
            members1.show();
            members2.show();

        }else {
            System.out.println("余额不足");
        }

    }
}
