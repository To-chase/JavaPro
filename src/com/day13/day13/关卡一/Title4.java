package com.day13.day13.关卡一;

import java.util.LinkedList;

public class Title4 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.addFirst(3);
        linkedList.addFirst(6);
        linkedList.addLast(8);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());


    }
}
