package com.day14.day14.异常关卡一;

public class Title6 {
    public static void main(String[] args)  {
//        get();
//        getStr();
//        String str=null;
//        charAts(str,1);
        //----------------
        String str="";
        charAts(str,-1);
        //----------------
//        String str="hello";
//        System.out.println(charAts(str,2));
    }

    public static char charAt(String str,int index)throws ArrayIndexOutOfBoundsException{
        char[] ch=str.toCharArray();
        return ch[index];
    }

    public static char charAts(String str,int index){

        try {
            char[] ch=str.toCharArray();
            char chs;
             chs = ch[index];
             return chs;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
            return 0;
        }catch (NullPointerException e){
            System.out.println("字符串不能为null");
            return 0;
        }catch(Exception e){
            System.out.println("字符串不能为空");
            return 0;
        }

    }
}
