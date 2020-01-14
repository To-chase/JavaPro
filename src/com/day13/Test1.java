package com.day13;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("a");
        list.addFirst("b");
        list.addLast("c");
        list.addFirst("d");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.removeFirst());
        System.out.println(list);
        if(!list.isEmpty()){
            System.out.println(list.pop());
        }
    }
}
