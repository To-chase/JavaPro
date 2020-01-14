package com.day13.day13.关卡三;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Title2 {
    public static void main(String[] args) {
        HashSet<Student> croom1=new HashSet<>();
        HashSet<Student> croom2=new HashSet<>();
        HashSet<HashSet> set=new HashSet<>();
        Collections.addAll(croom1,new Student("amy",18),new Student("lulu",23));
        Collections.addAll(croom2,new Student("amy1",19),new Student("lulu1",24));
        set.add(croom1);
        set.add(croom2);
//        System.out.println(set.size());
        //第一种
        Iterator<HashSet> it=set.iterator();
        while(it.hasNext()){
           HashSet<Student> s1=it.next();
           for(Student s:s1){
               System.out.println("姓名:"+s.getName()+" 年龄:"+s.getAge());
           }
        }
        System.out.println("------------------------------------------------------------");
        set.stream().forEach(n->{
            HashSet<Student> s2=n;
            for(Student student:s2){
                System.out.println("姓名:"+student.getName()+" 年龄:"+student.getAge());
            }
        });
    }
}
