package com.day10.com.til2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Subject subject=new Subject();
        subject.setSubjectName("java");
        Teacher teacher=new Teacher();
        teacher.setName("张老师");
        List<Student> list=new ArrayList<>();
        subject.setTeacher(teacher);
        Student student1=new Student("小红","上课");
        Student student2=new Student("小亮","上课");
        Student student3=new Student("小明","旷课");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        subject.setStudents(list);
//        System.out.println("list:"+list.size());
        String str=subject.show();
        System.out.println(str);
    }
}
