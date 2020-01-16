package com.day19.day19;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Title9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.next();
        try {
            PrintStream ps=new PrintStream("d.txt");
            ps.print(str);
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
