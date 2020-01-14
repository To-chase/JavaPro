package com.day13;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<Student> set=new LinkedHashSet<>();
        set.add(new Student("amy",12));
        set.add(new Student("amy",12));
        set.add(new Student("amy",13));
        set.add(new Student("amy1",12));
        for(Student s:set){
            System.out.println(s.toString());
        }

        System.out.println("aa".hashCode());
        System.out.println("bB".hashCode());
        System.out.println("aa".equals("bB"));

    }
}
