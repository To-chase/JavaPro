package com.day10.day10.til2;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<User> list=new ArrayList<>();
        for(int i=1;i<=50;i++){
            list.add(new User(i));
        }
        Filterpeople p1=new Filterpeople();
        Filterpeople p2=new Filterpeople();
        Filterpeople p3=new Filterpeople();
        p1.setFilter(new Filter() {
            @Override
            public User filterUser(User user) {
               if(user.getId()>=10&&user.getId()<=19){
                   user.setType("v1");
               }
                return user;
            }
        });

        p2.setFilter(new Filter() {
            @Override
            public User filterUser(User user) {
                if(user.getId()>=20&&user.getId()<=29){
                    user.setType("v2");
                }
                return user;
            }
        });
        for(int i=0;i<list.size();i++){
            User user=list.get(i);
            p1.setUser(user);
            p2.setUser(user);
            p3.setUser(user);
        }

        System.out.println(list);


    }
}
