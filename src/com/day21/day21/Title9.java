package com.day21.day21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

public class Title9 {
    public static void main(String[] args) throws Exception {
        File f=new File("D:\\work\\javaPro\\src\\com\\day21\\day21\\count.properties");
        if(!f.exists()){
            f.createNewFile();
        }
        Properties pro = new Properties();
        pro.load(Title9.class.getResourceAsStream("/com/day21/day21/count.properties"));
        Set<String> set = pro.stringPropertyNames();
        for (String str : set) {
            if (pro.getProperty(str).equals("null")) {
                String num="0";
              pro.setProperty(str,num);
            }
        }
        Integer num=Integer.parseInt(pro.getProperty("count"));
        if(num<=3){
            System.out.println("次数:"+num);
            num++;
            pro=save(pro,num);
        }else{
            System.out.println("程序使 用次数已满，请续费");
        }

    }

    public static Properties save(Properties pro,Integer num) throws Exception{
        FileOutputStream fos=new FileOutputStream("D:\\work\\javaPro\\src\\com\\day21\\day21\\count.properties");
        String count="count="+num;
        fos.write(count.getBytes());
        fos.close();
        return pro;
    }
}
