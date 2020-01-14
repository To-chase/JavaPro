package com.day10.Red;

import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        //红包模式

//        OpenMoney openMoney=new Common();
        Qunzhu qunzhu=new Qunzhu("群主大大",new Common());
        //红包金额，个数
        OpenMoney openMoney=qunzhu.getOpenMoney();
//        List<Integer> list=openMoney.faHongbao(93,5);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        Qunzhu qunzhu1=new Qunzhu("群主大大",new Luck());
        OpenMoney openMoney1=qunzhu1.getOpenMoney();
        List<Integer> list1=openMoney1.faHongbao(93,5);
        for(int i=0;i<list1.size();i++){
            System.out.println((i+1)+list1.get(i));
        }
    }
}
