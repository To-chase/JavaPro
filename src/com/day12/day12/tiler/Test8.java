package com.day12.day12.tiler;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("马云",20,78.5d));
        list.add(new Student("李四",21,79.5d));
        list.add(new Student("王五",18,88.5d));
        list.add(new Student("张三",19,98.5d));
        list.add(new Student("amy",20,59.5d));
        double max=list.get(0).getScore();
        double min=list.get(0).getScore();
        double sum=0;
        Iterator<Student> it=list.iterator();
        while(it.hasNext()){
            Student s=it.next();
            if(s.getScore()>max){
                max=s.getScore();
            }
            if(s.getScore()<min){
                min=s.getScore();
            }
            sum+=s.getScore();
        }

        System.out.println("最高分:"+max);
        System.out.println("最低分:"+min);
        System.out.println("总分:"+sum);
        System.out.println("平均分:"+(sum/list.size()));


    }
}
