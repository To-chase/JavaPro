package com.day13.day13.关卡一;

import java.util.Collections;
import java.util.HashSet;

public class Test7 {
    public static void main(String[] args) {
        HashSet<Person> set=new HashSet<>();
        Collections.addAll(set,new Person("amy",12),new Person("luly",16),new Person("amy",12),new Person("李四",20));
        System.out.println(set);
    }
}
