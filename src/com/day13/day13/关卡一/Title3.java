package com.day13.day13.关卡一;

import java.util.LinkedList;

public class Title3 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.set(1,8);
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.remove(2));
        linkedList.clear();
        System.out.println(linkedList.size());
    }
}
