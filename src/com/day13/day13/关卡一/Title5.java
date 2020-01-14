package com.day13.day13.关卡一;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Title5 {
    public static void main(String[] args) {
        //Set不能保证集合里元素的顺序。
        //在往set中添加元素时，如果指定元素不存在，则添加成功。也就是说，如果set中不存在(e==null ? e1==null : e.queals(e1))的元素e1,则e1能添加到set中。
        HashSet<String> set=new HashSet<>();
        Collections.addAll(set,"张三","李四","王五","李四");
        Iterator<String> it=set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
