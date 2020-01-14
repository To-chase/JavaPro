package com.day16;

import java.util.Arrays;

public class Title8 {
    public static void main(String[] args) {
        Student[] student={new Student("amy",79),new Student("lulu",89),new Student("李四",99)};
        Arrays.sort(student,(o1,o2)->{
            int result=o2.getScore()-o1.getScore();
            return result;
        });
        for(int i=0;i<student.length;i++){
            System.out.println(student[i]);
        }

    }
}
