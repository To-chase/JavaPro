package com.day19.test5;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test3 {
    public static void main(String[] args) {
        try {
            PrintStream ps=new PrintStream("a.txt");
//            ps.write(98);
//            ps.print("一起走过的日子");
            System.setOut(ps);
            System.out.println("一起走过的日子");
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
