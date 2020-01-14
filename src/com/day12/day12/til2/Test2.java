package com.day12.day12.til2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("adb4");

        Iterator<String> it=list.iterator();
        while(it.hasNext()){//返回该集合还有下一个元素吗?有就返回true
            System.out.println(it.next());//法返回集合该索引的值，并且把指针指向下一元素
        }
    }
}
