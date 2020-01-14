package com.day10.day10.til2;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        User u=new User();
        List<User> list=new ArrayList<>();
        for(int i=1;i<=50;i++){
            list.add(new User(i));
        }
        System.out.println(list);
        System.out.println("-----------------------------------");
        //设置v1
        for(int i=1;i<=50;i++){
            if(i>=10&&i<=19){
                list.get(i-1).setType("v1");
            }else if(i>=20&&i<=29){
                list.get(i-1).setType("v2");
            }
        }
        System.out.println(list);
        System.out.println("-------------------------");
        Filterpeople p=new Filterpeople();
//        p.setUser(list);
//        System.out.println(list);
    }
}
