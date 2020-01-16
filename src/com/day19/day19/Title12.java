package com.day19.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class Title12 {
    public static void main(String[] args) throws Exception {
       Path path= Paths.get("D:\\work\\javaPro\\a.txt");
       Files.copy(path,Paths.get("D:\\work\\javaPro\\b.txt"), StandardCopyOption.REPLACE_EXISTING);
       Files.delete(path);

    }

}
