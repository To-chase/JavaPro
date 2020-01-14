package com.day12.day12.tiler;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        list.add(new People("lulu", 20, 1.8d));
        list.add(new People("amy", 20, 1.56d));
        list.add(new People("luly", 20, 1.66d));
        list.add(new People("李四", 20, 1.75d));
        list.add(new People("马云", 20, 1.70d));

        Iterator<People> it = list.iterator();
        People max=list.get(0);
        People min=list.get(0);
        while(it.hasNext()){
            People p=it.next();
            if(p.getHeight()>max.getHeight()){
                max=p;
            }
            if(p.getHeight()<min.getHeight()){
                min=p;
            }
        }
        System.out.println("最高的人:"+max.getName()+"身高:"+max.getHeight());
        System.out.println("最矮的人:"+min.getName()+"身高:"+min.getHeight());



    }
}
