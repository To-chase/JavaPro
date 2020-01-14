package com.day12.day12.til1;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add("马云");
        collection.add(234);
        collection.add(14.567d);
        collection.add(true);
       collection.remove("马云");
        System.out.println(collection.size());
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
    }
}
