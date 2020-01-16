package com.day19.test5;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test2(){
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("user.txt"));
            User u=(User) ois.readObject();
            ois.close();
            System.out.println(u);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void test1(){
        User user=new User("amy",21);
//        User user1=new User("lulu",18);
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("user.txt"));
            oos.writeObject(user);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
