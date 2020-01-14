package com.day08.day08;

import com.day08.day08.til5.Student;
import com.day08.day08.til5.Teacher;

public class Test5 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("李小平","java");
         teacher.teach();
        Student student=new Student("李小乐",90);
        student.results();
    }
}
