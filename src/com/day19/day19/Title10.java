package com.day19.day19;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Title10 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt"));
            String line = null;
            List<String> list=new ArrayList<>();
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            Collections.reverse(list);
            for(String s:list){
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
