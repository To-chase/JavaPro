package com.day19.test5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<User> list=new ArrayList<>();
        User u=new User("amy",23);
        User u1=new User("amy1",33);
        User u2=new User("amy2",26);
        list.add(u);
        list.add(u1);
        list.add(u2);
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("user.txt"));
            oos.writeObject(list);
            oos.close();
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("user.txt"));
            List<User> list1=(List<User>) ois.readObject();
            ois.close();
            System.out.println(list1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
