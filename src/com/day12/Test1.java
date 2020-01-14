package com.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");

        //foreach
//        for (String str:collection) {
//            System.out.println(str);
//        }
        //迭代器
        Iterator<String> it=collection.iterator();
        while(it.hasNext()){
            String name=it.next();
            String name2=it.next();
            System.out.println(name);
            System.out.println(name2);
        }
    }
}
