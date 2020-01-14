package com.day17.test2;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File file=new File("D:\\a");
        delete(file);
    }

    public static void delete(File file){
        File[] files=file.listFiles();
//        System.out.println(file);
        if(files.length==0){
//        if(file!=null){
            for(File f:files){
                if(f.isFile()){
                    f.delete();
                }else if(f.isDirectory()){
                    if(f.length()==0){
                        f.delete();
                    }
                    delete(f);
//                    System.out.println(f.getName()+":"+f.length());
                }
            }
        }
    }
//        System.out.println("删除成功");
//    }
}
