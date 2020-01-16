package com.day18.day18.关卡二;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Title1 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        Scanner sc=new Scanner(System.in);
        try {
            fos=new FileOutputStream("D:\\stu.txt");
            while(true){
                System.out.println("请输入学生信息(格式:学号-学生姓名,输入end结束):");
                String stu=sc.next();
                if(stu.equals("end")){
                    break;
                }
                byte[] b=stu.getBytes();
                fos.write(b,0,b.length);
                fos.write("\r\n".getBytes());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
