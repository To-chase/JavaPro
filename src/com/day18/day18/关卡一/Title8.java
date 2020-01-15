package com.day18.day18.关卡一;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Title8 {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw=new FileWriter("D:\\info.txt");
            Scanner sc=new Scanner(System.in);
            while(true){
                System.out.println("请输入内容(输入886结束):");
                String str=sc.next();
                if(str.equals("886")){
                    break;
                }
                fw.write(str);
                fw.write("\r\n");
                fw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
