package com.day18.day18.关卡二;

import java.io.*;
import java.util.UUID;

public class Title5 {
    public static void main(String[] args) {

        File file = new File("D:\\ccc");
        Integer index=0;
         index=get(index,file);
        System.out.println(index);
    }

    //D:\\java
    public static Integer get(Integer index,File file) {
        FileReader fr = null;
        FileWriter fw = null;
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getAbsolutePath());
                String path = f.getAbsolutePath();
                String[] str = path.split("\\\\");
                String realname = str[str.length - 1];
                String[] hou=realname.split("\\.");
                if(hou[1].equals("java")){
                    index++;
                try {
                    fr = new FileReader(path);
//                    fw=new FileWriter("D:\\java\\"+realname);
                    File file1 = new File("D:\\ja");
                    File[] files1 = file1.listFiles();
                    int count = 0;
                    for (File f1 : files1) {
                        if (f1.getName().equals(realname)) {
                            count++;
                        }
                    }
                    if (count > 0) {
                        realname = UUID.randomUUID().toString() + realname;
                    }
                    System.out.println(realname);
//                    String name="";
                    fw = new FileWriter("D:\\ja\\" + realname);
                    //获取写出的文件路径

                    char[] b = new char[1024];
                    int len;
                    while ((len = fr.read(b)) != -1) {
                        fw.write(b, 0, len);
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        fw.flush();
                        fw.close();
                        fr.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                }
            } else {
                get(++index,f);
            }
        }
        return index;

    }
}
