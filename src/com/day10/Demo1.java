package com.day10;


import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
//        List<Student> list=new ArrayList<>();
//        list.add(new Student("amy",27));
//        list.add(new Student("lulu",18));
//        list.add(new Student("李四",20));
        Student[] student={
                new Student("amy",27,90),
                new Student("lulu",18,77),
                new Student("李四",20,89),
                new Student("李四",20,100)
        };
//        Comparator<Student> com=new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int result=o2.getAge()-o1.getAge();
//                if(result==0){
//                    result=o1.getScore()-o2.getScore();
//                }
//                return result;
//            }
//        };
//        Arrays.sort(student,com);
        Arrays.sort(student,(o1,o2)->{
            int result=o2.getAge()-o1.getAge();
                if(result==0){
                    result=o1.getScore()-o2.getScore();
                }
                return result;
        });
        for(Student student1:student){
            System.out.println(student1);
        }
    }
}
