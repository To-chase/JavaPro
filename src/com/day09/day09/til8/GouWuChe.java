package com.day09.day09.til8;


import java.util.ArrayList;
import java.util.List;

public class GouWuChe {
    List<Goods> list=new ArrayList<>();

    public  void addGoods(Goods goods){
        list.add(goods);
        System.out.println("加入"+goods.name+"  成功");
    }

    public void show(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).id+","+list.get(i).name+","+list.get(i).price);
        }
    }

    public void total(){
        double total=0;
        double discount=0;
        for(int i=0;i<list.size();i++){
           if(list.get(i) instanceof EGoods){
               total+=list.get(i).price;
               discount+=list.get(i).price*0.88;
           }else{
               total+=list.get(i).price;
               discount+=list.get(i).price;
           }
        }
        System.out.println("原价为:"+total);
        System.out.println("折后价为:"+discount);
    }
}
