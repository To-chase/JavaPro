package com.day13.day13.关卡二;

import java.util.HashSet;
import java.util.Iterator;

public class Title4 {
    public static void main(String[] args) {
        HashSet<Student> set=new HashSet<>();
        for (int i=0;i<9;i++){
            String name="amy"+i;
            set.add(new Student(name,18,"女"));
        }

        set.add(new Student("amy1",18,"女"));
//        set.stream().forEach(n->{
//            System.out.println(n);
//        });
        for(Student student:set){
            System.out.println(student);
        }

        System.out.println("---------------------------------");

        Iterator<Student> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
