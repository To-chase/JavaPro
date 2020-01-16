package com.day19.day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Title8 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("stu.txt"));
            Student stu=(Student)ois.readObject();
            ois.close();
            System.out.println(stu);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
