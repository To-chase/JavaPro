package com.day21.day21.title10;

@MyAnno1()
public class Test1 {
    @MyAnno2()
    String type;
    public static void main(String[] args) {
//        Class<MyAnno1> c=MyAnno1.class;
//        System.out.println("字节码对象:"+c);


    }

    @MyAnn03(type = "subject",intArr = {1,2,3})
    public static void eat(){

    }
}
