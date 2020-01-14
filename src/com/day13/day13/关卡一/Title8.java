package com.day13.day13.关卡一;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Title8 {
    public static void main(String[] args) {
        HashSet<String> set=new LinkedHashSet<>();
        Collections.addAll(set,"王昭君","王昭君","杨玉环","西施","貂蝉");
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------------------------------------------------");
        for(String str:set){
            System.out.println(str);
        }
    }
}
