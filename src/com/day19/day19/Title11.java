package com.day19.day19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Title11 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student stu=new Student("amy",18,"女");
        Student stu1=new Student("路西",18,"男");
        Student stu2=new Student("lulu",18,"女");
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stu.txt"));
            oos.writeObject(list);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
