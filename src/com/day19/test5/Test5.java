package com.day19.test5;

import java.io.BufferedReader;
import java.nio.file.*;

public class Test5 {
    public static void main(String[] args) throws Exception {
        Path path= FileSystems.getDefault().getPath("javaPro","a.txt").toAbsolutePath();
//        System.out.println(path);
//        Path p=Paths.get("javaPro","f.txt");
////        Files.createFile(p);
//        System.out.println(p.toAbsolutePath());
//
//        Files.copy(path,p,StandardCopyOption.REPLACE_EXISTING);


    }
    public static void copy()throws Exception{
        Path path= Paths.get("D:\\c.jpg");
        Files.copy(path,Paths.get("D:\\a.jpg"), StandardCopyOption.REPLACE_EXISTING);
        BufferedReader br = Files.newBufferedReader(Paths.get("D:\\index.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
//        Files.delete(path);
    }
}
