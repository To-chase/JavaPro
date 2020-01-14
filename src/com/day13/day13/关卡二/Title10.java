package com.day13.day13.关卡二;

import com.day10.Test7.Person;

import java.util.HashSet;
import java.util.Iterator;

public class Title10 {
    public static void main(String[] args) {
        HashSet<Student> set=new HashSet<>();
        set.add(new Student("amy",23,98));
        set.add(new Student("luly",23,86));
        set.add(new Student("lulu",33,97));
        set.add(new Student("amy1",24,87));
        set.add(new Student("amy2",25,88));
        Iterator<Student> it=set.iterator();
        Student max=it.next();
        Student min=it.next();
        int sum=0;
        for(Student s:set){
            sum+=s.getScore();
            if(max.getScore()<s.getScore()){
                max=s;
            }
            if(min.getScore()>s.getScore()){
                min=s;
            }
        }
        System.out.println("总分:"+sum);
        System.out.println("平均分:"+(sum/set.size()));
        System.out.println("最高分:"+max.getScore());
        System.out.println("最低分:"+min.getScore());
    }
}
