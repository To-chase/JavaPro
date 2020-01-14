package com.day12.day12.til12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        List<People> list=new ArrayList<>();
        list.add(new People("lulu", 20, 1.8d));
        list.add(new People("amy", 20, 1.56d));
        list.add(new People("amy1",15,1.68));
        list.add(new People("amy2",18,1.78));
        list.add(new People("amy3",19,1.69));
        Iterator<People> it=list.iterator();
        while(it.hasNext()){
            People p=it.next();
            p.setAge(p.getAge()+2);
        }

        for (People people:list) {
            System.out.println("姓名:"+ people.getName()+" 年龄:"+people.getAge()+"  身高:"+people.getHeight());
        }
    }
}
