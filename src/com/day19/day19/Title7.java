package com.day19.day19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Title7 {
    public static void main(String[] args) {
        Student student=new Student("王五",18,"男");
            try {
                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stu.txt"));
                oos.writeObject(student);
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
